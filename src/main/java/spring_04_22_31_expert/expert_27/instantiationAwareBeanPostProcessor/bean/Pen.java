package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Pen implements DisposableBean {
    private Integer ink = 100;

    // 先执行
    @PreDestroy
    public void outwellInk() {
        System.out.println("Pen @PreDestroy 钢笔中的墨水都放干净了。。。");
    }

    // 后执行
    @Override
    public void destroy() throws Exception {
        System.out.println("Pen DisposableBean 写完字了。。。");
    }

    public Integer getInk() {
        return ink;
    }

    public void setInk(Integer ink) {
        this.ink = ink;
    }
}
