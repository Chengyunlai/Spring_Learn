package spring_04_22_31_expert.expert_25.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import spring_04_22_31_expert.expert_25.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) configurableListableBeanFactory;
        // 获取IOC容器中的所有BeanDefinition
        for (String beanDefinitionName : configurableListableBeanFactory.getBeanDefinitionNames()) {
            // 判断BeanDefinition对应的Bean是否为Person类型
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            // System.out.println(beanDefinition.getBeanClassName());
            if (Person.class.getName().equals(beanDefinition.getBeanClassName())) {
                // 判断Person的性别是否为male
                // 使用xml配置文件对bean进行属性注入，最终取到的类型为TypedStringValue，这一点不需要记住
                TypedStringValue sex = (TypedStringValue) beanDefinition.getPropertyValues().get("sex");
                if ("male".equals(sex.getValue())) {
                    // 移除BeanDefinition
                    registry.removeBeanDefinition(beanDefinitionName);
                }
            }
        }
    }
}
