/**
 * Created by Administrator on 2017/5/31.
 */
public class MyException extends Exception{
    private String mString;
    public MyException(String mString){
        super();
        this.mString=mString;

    }
    public String getException(){
        return "Exception is "+mString;
    }

}
