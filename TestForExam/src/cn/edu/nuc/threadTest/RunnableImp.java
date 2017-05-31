package cn.edu.nuc.threadTest;

/**
 * Created by Administrator on 2017/5/31.
 */
public class RunnableImp implements Runnable {
    int count=20;

    @Override
    public void run() {
        synchronized (this) {
            while (count > 0) {
                System.out.println(Thread.currentThread() + "" + count--);
            }
        }
    }
    public static void main(String[] args) {
        RunnableImp mRunnableImp=new RunnableImp();
        Thread mThread=new Thread(mRunnableImp);

        Thread mThread1=new Thread(mRunnableImp);
        mThread1.start();
        mThread.start();
    }
}
