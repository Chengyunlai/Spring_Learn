package spring_02_06_13_basic.basic_08.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Pink {
    @Value("#{'${red.name}'}")
    private String color;

    @Override
    public String toString() {
        return "Pink{" +
                "color='" + color + '\'' +
                '}';
    }
}
