package cn.edu.nuc.Test;

import cn.edu.nuc.strategy.BaseSort;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Student extends BasePeople {
    private int xuehao;
    public Student(String mName, String mSex, int mAge, int mNumber,int xuerhao) {
        super(mName, mSex, mAge, mNumber);
        this.xuehao=xuerhao;
    }

    @Override
    protected void printMyself() {

        System.out.println("this is a student"+xuehao);
    }
}
