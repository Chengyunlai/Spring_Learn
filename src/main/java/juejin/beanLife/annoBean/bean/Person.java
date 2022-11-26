package juejin.beanLife.annoBean.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Person {
    private String name = null;
    private Integer Hp = 0;

    @PostConstruct
    public void addHp(){
        this.Hp = 100;
    }

    @PreDestroy
    public void reduceHp(){
        this.Hp -= 100;
        System.out.println("Hp被灭啦");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getHp() {
        return Hp;
    }

    public void setHp(Integer hp) {
        Hp = hp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Hp=" + Hp +
                '}';
    }
}
