package spring_02_06_13_basic.basic_13.bean.jsr;

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
public class Pen {
    private Integer sum;

    @PostConstruct
    public void add(){
        System.out.println("加了100元");
        this.sum = 100;
    }

    @PreDestroy
    public void reduce(){
        System.out.println("减了100元");
        this.sum = 0;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "sum=" + sum +
                '}';
    }
}
