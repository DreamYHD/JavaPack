package cn.edu.nuc.factory;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Product1 extends Product {
    @Override
    public void start() {
        System.out.println("product 1  start");
    }
    @Override
    public void end() {
        System.out.println("product 1 end");
    }
}
