package cn.edu.nuc.strategy;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Client {

    public static void main(String[] args) {
        Context mContext = new Context();
        mContext.setBaseSort(new BaseSort() {
            @Override
            public void sort() {

                System.out.println("this is anno");
            }
        });

        mContext.sort();
        mContext.setBaseSort(new Quciksort());
        mContext.sort();







    }

}
