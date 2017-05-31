/**
 * Created by Administrator on 2017/5/26.
 */
public class Employee {
    int x=0;
    static int y=0;

    private String name;
    private double salary;
    public Employee(String n,double s){   name=n;salary=s;  }
    public Employee(String n){   name=n;  }
    public void eat(){
        System.out.println("i can eat");
    }
    public static void say(){
        System.out.println("i can say  employer");
    }
}
