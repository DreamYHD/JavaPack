package cn.edu.nuc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/4/27.
 */
public class SpiltTest {
    public static void main(String[] args) {
        File mFile=new File("f://helloWorld.txt");
        try {
            FileInputStream mFileInputStream=new FileInputStream(mFile);
            FileOutputStream mFileOutputStream1=new FileOutputStream("f://helloworld1.txt");
            FileOutputStream mFileOutputStream2=new FileOutputStream("f://helloworld2.txt");
            FileOutputStream mFileOutputStream3=new FileOutputStream("f://helloworld3.txt");



        } catch (FileNotFoundException mE) {
            mE.printStackTrace();
        }

    }
}
