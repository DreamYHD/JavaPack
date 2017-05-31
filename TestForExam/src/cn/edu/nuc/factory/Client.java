package cn.edu.nuc.factory;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Client {
    public static void main(String[] args) {
        Factory mFactory = new Factory();
        Product mProduct = mFactory.creatProduct(Product1.class);

        mProduct.start();
        mProduct.end();

        Product mProduct1 = mFactory.creatProduct(new Product() {
            @Override
            public void start() {

                System.out.println("匿名内部类开始");
            }

            @Override
            public void end() {
                System.out.println("匿名内部类结束");
            }
        }.getClass());
        mProduct1.start();
        mProduct1.end();





    }
}
