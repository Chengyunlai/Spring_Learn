package spring_02_06_13_basic.basic_07.annotation.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
// 代表该类会被注册到 IOC 容器中作为一个 Bean
@Component("MyDog") // 容器中id为MyDog
public class Dog {
    private String name;
}
