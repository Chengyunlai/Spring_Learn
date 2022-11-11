package spring_02_06_12_basic.basic_10.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class ApplicationContextAwareBean implements ApplicationContextAware, BeanNameAware, NamedBean {
    private ApplicationContext ctx;
    private String beanName;
    /**
     * @Description:当这个 `ApplicationContextAwareBean` 被初始化好的时候，就会把 `ApplicationContext` 传给它
     * @Param: [applicationContext]
     * @return: void
     * @Author: chengyunlai
     * @Date: 2022/11/11
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    public void printBeanNames() {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }


    @Override
    public String getBeanName() {
        return beanName;
    }
}
