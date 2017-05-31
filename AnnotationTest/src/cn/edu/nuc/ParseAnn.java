package cn.edu.nuc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/22.
 */
public class ParseAnn {
    public static void main(String[] args) {
        //使用类加载器加载类
        try {
            Class mClass=Class.forName("cn.edu.nuc.Child");
            //找到类上面的注解
            boolean is=mClass.isAnnotationPresent(Description.class);
            if (is) {
                //拿到注解的实例
                Description mDescription= (Description) mClass.getAnnotation(Description.class);
                System.out.println(mDescription.value());
            }

            //找到方法的注解
            Method[]ms=mClass.getMethods();
            for (Method mMethod:ms) {
                boolean isM=mMethod.isAnnotationPresent(Description.class);
                if (isM){
                    Description mDescription=mMethod.getAnnotation(Description.class);
                    System.out.println(mDescription.value());
                }
                
            }
            //另一种找到注解的方法
            for (Method mMethod:ms) {
                Annotation []mAnnotations=mMethod.getAnnotations();
                for (Annotation mAnnotation:mAnnotations){
                    if (mAnnotation instanceof  Description){
                        System.out.println(((Description) mAnnotation).value());
                    }
                }
            }

        } catch (ClassNotFoundException mE) {
            mE.printStackTrace();
        }

    }
}
