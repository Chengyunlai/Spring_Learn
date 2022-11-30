package spring_04_22_31_expert.expert_25;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_04_22_31_expert.expert_25.bean.Cat;
import spring_04_22_31_expert.expert_25.bean.Person;
import spring_04_22_31_expert.expert_25.config.BeanDefinitionRegistryConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanDefinitionRegistryApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanDefinitionRegistryConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("--");
        Cat cat = (Cat) ctx.getBean("cat");
        System.out.println(cat);

        BeanDefinition catDefinition = ctx.getBeanFactory().getMergedBeanDefinition("cat");
        System.out.println(catDefinition);
        // Person person = ctx.getBean(Person.class);
        // Person wangwu = (Person) ctx.getBean("wangwu");
        // System.out.println(wangwu);
    }
}
