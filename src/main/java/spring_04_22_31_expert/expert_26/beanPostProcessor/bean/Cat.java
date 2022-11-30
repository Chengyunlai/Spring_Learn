package spring_04_22_31_expert.expert_26.beanPostProcessor.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {
    private String name;
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat_bean销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat_bean初始化方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
