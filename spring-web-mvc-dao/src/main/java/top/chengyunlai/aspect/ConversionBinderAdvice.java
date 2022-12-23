package top.chengyunlai.aspect;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@ControllerAdvice
public class ConversionBinderAdvice {
    // 定制化参数解析（缺点是每次Controller方法的执行都会被触发）
    @InitBinder
    public void addDateBinder(WebDataBinder dataBinder) {
        dataBinder.addCustomFormatter(new DateFormatter("yyyy年MM月dd日"));
    }
}
