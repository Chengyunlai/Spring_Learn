package spring_04_22_31_expert.expert_24;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_04_22_31_expert.expert_24.config.BeanDefubutuinConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanDefinitionQuickstartXmlApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanDefubutuinConfig.class);
        BeanDefinition personBeanDefinition = ctx.getBeanFactory().getBeanDefinition("person");
        System.out.println(personBeanDefinition);
        System.out.println(personBeanDefinition.getClass().getName());

        System.out.println("---");

        BeanDefinition cat = ctx.getBeanFactory().getBeanDefinition("cat");
        System.out.println(cat);
        System.out.println(cat.getClass().getName());

        System.out.println("---");

        BeanDefinition dog = ctx.getBeanFactory().getBeanDefinition("dog");
        System.out.println(dog);
        System.out.println(cat.getClass().getName());


    }
}
