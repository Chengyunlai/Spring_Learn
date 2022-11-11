package spring_02_06_13_basic.basic_09.bean;

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
public class Person {
    @Value("chengyunlai")
    public String name;
    @Value("18")
    public Integer age;

    @Override
    public String toString() {
        return "PersonXml{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
