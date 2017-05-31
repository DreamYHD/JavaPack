/**
 * Created by Administrator on 2017/5/31.
 */
public class Test2  {

    public static void test(int a)throws MyException{

        if (a >= 16) {
            throw new MyException("to big");
        }


    }

    public static void main(String[] args) {

        try {
            test(19);

            System.out.println("yhd");
        }catch (MyException mE){

            System.out.println(mE.getException());
        }finally {
            System.out.println("hello");

        }
    }
}
