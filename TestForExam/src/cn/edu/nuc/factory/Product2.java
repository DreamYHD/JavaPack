package cn.edu.nuc.factory;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Product2 extends Product {
    @Override
    public void start() {
        System.out.println("product 2 start");
    }
    @Override
    public void end() {
        System.out.println("product 2 end");
    }
}
