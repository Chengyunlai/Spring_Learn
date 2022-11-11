package spring_02_06_13_basic.basic_08.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Red {
    // 如何让这个name读取到外部properties的内容呢？
    // @Value("${red.name}") // 注释使用XML的方式
    private String name;

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    // 属性注入需要使用到set方法
    public void setName(String name) {
        this.name = name;
    }
}
