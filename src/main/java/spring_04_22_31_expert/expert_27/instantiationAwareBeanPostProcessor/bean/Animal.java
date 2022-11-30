package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public abstract class Animal {
    private Person person;

    @Autowired
    public void setPerson(Person person) {
        System.out.println("Animal setPerson run ......");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
