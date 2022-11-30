package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean;

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
public class Cat extends Animal{
    @Value("咪咪")
    private String name;

    public Cat() {
        System.out.println("Cat constructor run ......");
    }

    @Override
    public String toString() {
        return "Cat {person: " + this.getPerson() + ", name: " + name + "}";
    }
}
