package spring_04_22_31_expert.expert_26.beanPostProcessor.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import spring_04_22_31_expert.expert_26.beanPostProcessor.bean.Cat;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class AnimalBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("拦截到Bean的初始化之前：" + bean);
        if (bean instanceof Cat){
            bean = (Cat)bean;
            ((Cat) bean).setName("小米6");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("拦截到Bean的初始化之后：" + bean);
        if(bean instanceof Cat){
            System.out.println(((Cat) bean).getName());
        }
        return bean;
    }
}
