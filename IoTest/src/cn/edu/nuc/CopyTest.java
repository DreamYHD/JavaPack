package cn.edu.nuc;

import java.io.*;

/**
 * Created by Administrator on 2017/4/27.
 */
public class CopyTest {


    public static void main(String[] args) {
        String path="f://dojocat.jpg";
        File mFile=new File(path);
        File mCopyFile=new File("d://copy.jpg");
        try {
            FileInputStream mInputStream=new FileInputStream(mFile);
            FileOutputStream mFileOutputStream=new FileOutputStream(mCopyFile);
            byte[]mBytes=new byte[10];
            int line=0;
            while ((line=mInputStream.read(mBytes))!=-1){
                mFileOutputStream.write(mBytes);
            }

        } catch (FileNotFoundException mE) {
            mE.printStackTrace();
        } catch (IOException mE) {
            mE.printStackTrace();
        }

    }
}
