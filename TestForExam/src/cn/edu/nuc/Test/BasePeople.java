package cn.edu.nuc.Test;

/**
 * Created by Administrator on 2017/5/31.
 */
public abstract class BasePeople {

    private String name;
    private String sex;
    private int age;
    private int number;

    public BasePeople(String mName, String mSex, int mAge, int mNumber) {
        name = mName;
        sex = mSex;
        age = mAge;
        number = mNumber;
    }
    public void print(){
        printMyself();
        System.out.println("name is "+name);
        System.out.println("sex is "+sex);
        System.out.println("age is "+age);
        System.out.println("numebr is "+number);
    }
    protected abstract void printMyself();
}
