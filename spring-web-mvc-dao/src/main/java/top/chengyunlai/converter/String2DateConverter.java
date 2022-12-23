package top.chengyunlai.converter;


import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName
 * @Description 自定义的类型转换器
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class String2DateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        if (StringUtils.hasText(source)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return dateFormat.parse(source);
            } catch (ParseException e) {
                return null;
            }
        }
        return null;
    }
}
