package cn.edu.nuc;

/**
 * Created by Administrator on 2017/4/23.
 */
public class People {
    private String name;
    private int age;

    public People() {

    }

    public People(String mName, int mAge) {
        name = mName;
        age = mAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String mName) {
        name = mName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int mAge) {
        age = mAge;
    }
}
