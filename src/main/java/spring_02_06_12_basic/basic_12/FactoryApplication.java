package spring_02_06_12_basic.basic_12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_12_basic.basic_12.bean.Person;
import spring_02_06_12_basic.basic_12.bean.instanceFactory.InstanceFactory;
import spring_02_06_12_basic.basic_12.config.FactoryConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class FactoryApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FactoryConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("==");

        Person bean = ctx.getBean(Person.class);
        System.out.println(bean);
        Person bean1 = ctx.getBean(Person.class);
        System.out.println(bean1);
        Person bean2 = ctx.getBean(Person.class);
        System.out.println(bean2);
    }
}
