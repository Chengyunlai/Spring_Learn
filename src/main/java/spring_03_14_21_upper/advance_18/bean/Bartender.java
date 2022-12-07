package spring_03_14_21_upper.advance_18.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Bartender {
    private String name;

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
