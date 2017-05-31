package cn.edu.nuc.Test;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Client  {
    public static void main(String[] args) {
        Student mStudent=new Student("yhd","nan",18,10,10);
        mStudent.print();
        Teacher mTeacher=new Teacher("yhd","nv",20,22,"laoshi","zhingbe");
        mTeacher.print();
    }
}
