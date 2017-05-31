package cn.edu.nuc.IoCopy;

import java.io.*;

/**
 * Created by Administrator on 2017/5/31.
 */
public class CopyTest {

    public static void main(String[] args) {

        File mFile = new File("f://hello.txt");
        File mCopyFile = new File("f://helloCopy.txt");
        try {
            InputStream mInputStream = new FileInputStream(mFile);
            OutputStream mOutputStream = new FileOutputStream(mCopyFile);
            int len = 0;
            while ( ( len = mInputStream.read() ) != -1 ){
                mOutputStream.write(len);
            }
            mInputStream.close();
            mOutputStream.close();


        } catch (FileNotFoundException mE) {
            mE.printStackTrace();
        } catch (IOException mE) {
            mE.printStackTrace();
        }

    }

}
