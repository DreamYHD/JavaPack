import com.sun.javafx.css.Size;

/**
 * Created by Administrator on 2017/5/26.
 */
public class Test {
    public static void main(String[] args) {
        //String 转 int
        String mS = new String("10");
        Integer mI = Integer.parseInt(mS);
        Integer mInteger = Integer.valueOf(mS);
        System.out.println(mI);//拆箱
        System.out.println(mInteger);
        //String 转 double
        Double mDouble = Double.parseDouble(mS);
        mDouble ++;//自动拆箱
        System.out.println(mDouble);
        double mV = mDouble.doubleValue();//拆箱
        System.out.println(mV);



        //int double 转 String
        int a = 0;
        String b = a + "";
        b += "hello";
        System.out.println(b);
        String mS1 = Integer.toString(a);
        System.out.println(mS1);

        char mC='a';
        System.out.println(Character.SIZE);









    }
}
