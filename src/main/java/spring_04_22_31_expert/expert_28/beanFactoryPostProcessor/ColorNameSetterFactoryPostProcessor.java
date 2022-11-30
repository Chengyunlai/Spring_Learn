package spring_04_22_31_expert.expert_28.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import spring_04_22_31_expert.expert_28.bean.Color;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(beanName -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
                // if (Class.forName(beanDefinition.getBeanClassName()).getSuperclass().equals(Color.class)) {
                //
                // }
                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(),this.getClass().getClassLoader()).getSuperclass().equals(Color.class)){
                    beanDefinition.getPropertyValues().add("name",beanName);
                }
            }
        });
    }
}
