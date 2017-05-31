package cn.edu.nuc.strategy;

import org.omg.CORBA.BAD_CONTEXT;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Context {
    private BaseSort mBaseSort;
    public void setBaseSort(BaseSort mBaseSort){

        this.mBaseSort=mBaseSort;
    }
    public void sort(){
        mBaseSort.sort();
    }
}
