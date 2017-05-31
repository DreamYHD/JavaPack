package cn.edu.nuc;

import java.io.*;
import java.util.List;

/**
 * Created by Administrator on 2017/5/29.
 */
public class Test {
    public static void main(String[] args) {

        try {
            FileReader in = new FileReader("f://hello//tex1.txt");
            FileWriter out = new FileWriter("f://hello//tex1Copy.txt");
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(out);
            String str = null;
            while ((str = br.readLine()) != null){
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
            in.close();
            out.close();
            br.close();
            bw.close();
        } catch (FileNotFoundException mE) {
            mE.printStackTrace();
        } catch (IOException mE) {
            mE.printStackTrace();
        }

    }
}
