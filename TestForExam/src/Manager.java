/**
 * Created by Administrator on 2017/5/26.
 */
public class Manager extends Employee{
    int x=1;
    int y=1;
    public Manager(String n, double s) {
        super(n, s);
    }

    public Manager(String n) {
        super(n);
    }
    public void eat(){
        System.out.println("manager can eat");
    }
    public void run(){
        System.out.println("manager can run");
    }
    public static void say(){
        System.out.println("i can say manager");
    }
}
