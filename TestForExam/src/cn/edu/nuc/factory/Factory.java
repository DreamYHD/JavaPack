package cn.edu.nuc.factory;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Factory {

    public <T extends Product>T creatProduct(Class<T> mClass){
        T mT=null;
        try {
            //mProduct= Class.forName(mClass.getName()).newInstance();
            mT = mClass.newInstance();
        } catch (InstantiationException mE) {
            mE.printStackTrace();
        } catch (IllegalAccessException mE) {
            mE.printStackTrace();
        }
        return mT;

    }
}
