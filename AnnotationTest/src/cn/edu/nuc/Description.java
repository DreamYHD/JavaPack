package cn.edu.nuc;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/4/22.
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Description {

    String value();
}
