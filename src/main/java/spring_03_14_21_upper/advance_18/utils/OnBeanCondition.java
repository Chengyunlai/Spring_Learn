package spring_03_14_21_upper.advance_18.utils;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import spring_03_14_21_upper.advance_18.annotation.ConditionalOnBean;

import java.util.Map;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class OnBeanCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 先获取目标自定义注解ConditionalOnBean上的beanNames属性
        // String[] beanNames = (String[]) annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnBean.class.getName()).get("beanNames");

        Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnBean.class.getName());
        // 匹配类型
        Class<?>[] classes = (Class<?>[]) attributes.get("value");
        String[] beanNames = (String[])attributes.get("beanNames");

        for (Class<?> clazz : classes) {
            if (!conditionContext.getBeanFactory().containsBeanDefinition(clazz.getName())) {
                return false;
            }
        }

        // 逐个校验IOC容器中是否包含传入的bean名称
        for (String beanName : beanNames) {
            if (!conditionContext.getBeanFactory().containsBeanDefinition(beanName)) {
                return false;
            }
        }
        return true;
    }
}
