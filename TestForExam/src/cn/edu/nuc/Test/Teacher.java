package cn.edu.nuc.Test;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Teacher extends BasePeople {
    private String zhiwu;
    private String bumen;

    public Teacher(String mName, String mSex, int mAge, int mNumber,String mZhiwu,String mBumen) {
        super(mName, mSex, mAge, mNumber);
        this.zhiwu=mZhiwu;
        this.bumen=mBumen;
    }

    @Override
    protected void printMyself() {

        System.out.println("this is a teacher her zhiwu is "+zhiwu+"her bumen is "+bumen);
    }
}
