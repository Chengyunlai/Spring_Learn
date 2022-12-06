package juejin.aopAnnotation.utils;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
@Aspect
public class TimePrint {
    SimpleDateFormat matter = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
    @Before("execution(public * juejin.aopAnnotation.bean.UserService.* (..))")
    public void printTime(){
        System.out.println(matter.format(new Date()));
    }
}
