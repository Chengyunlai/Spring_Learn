package spring_02_06_13_basic.basic_07.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_13_basic.basic_07.annotation.bean.Person;
import spring_02_06_13_basic.basic_07.annotation.config.ApplicationConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AnnotationApplication {
    public static void main(String[] args) {
        // 使用 AnnotationConfigApplicationContext` 来驱动注解 IOC 容器，在构造方法中把配置类传入
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // System.out.println("===下面是使用XML的扫描包===");
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("basic/annotation07.xml");
        // String[] beanDefinitionNames1 = context.getBeanDefinitionNames();
        // for (String s : beanDefinitionNames1) {
        //     System.out.println(s);
        // }
    }
}
