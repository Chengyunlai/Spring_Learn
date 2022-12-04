package juejin.aopXml.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TimePrint {
    SimpleDateFormat matter = new SimpleDateFormat("现在时间:yyyy年MM月dd日E HH时mm分ss秒");
    public void printTime(){
        System.out.println(matter.format(new Date()));
    }
}
