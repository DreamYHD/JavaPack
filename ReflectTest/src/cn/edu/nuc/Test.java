package cn.edu.nuc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/23.
 */
public class Test {

    public static void main(String[] args) {

        Class mClass=Student.class;
        Student mStudent=new Student();
        try {
            Method mMethod=mClass.getMethod("eat",int.class);
            mMethod.invoke(mStudent,18);

        } catch (NoSuchMethodException mE) {
            mE.printStackTrace();
        } catch (IllegalAccessException mE) {
            mE.printStackTrace();
        } catch (InvocationTargetException mE) {
            mE.printStackTrace();
        }

    }
}
