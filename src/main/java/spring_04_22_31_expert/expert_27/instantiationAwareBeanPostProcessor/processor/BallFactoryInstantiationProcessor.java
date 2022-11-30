package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Ball;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
// 相比InstantiationAwareBeanPostProcessor比SmartInstantiationAwareBeanPostProcessor更加牛逼
public class BallFactoryInstantiationProcessor implements SmartInstantiationAwareBeanPostProcessor, DestructionAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("ball".equals(beanName)) {
            // 返回非null，代表拦截创建
            Ball ball = new Ball();
            ball.setId("工厂球~");
            return ball;
        }
        // 默认直接返回null，代表不拦截
        return null;
    }

    // postProcessAfterInstantiation 方法如果返回 false ，则 postProcessProperties 方法就不会执行


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        // return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
        return false;
    }

    // postProcessProperties不会影响postProcessBeforeInstantiation,这里我们将所有的ball拦截
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if ("ball2".equals(beanName)) {
            MutablePropertyValues values = new MutablePropertyValues(pvs);
            values.addPropertyValue("id", "拦截球~");
            return values;
        }
        return null;
    }

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
    }

    // 可以在 bean 的销毁前拦截处理
    @Override
    public void postProcessBeforeDestruction(Object o, String s) throws BeansException {

    }
}
