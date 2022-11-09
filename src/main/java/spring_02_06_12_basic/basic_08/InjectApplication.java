package spring_02_06_12_basic.basic_08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_12_basic.basic_08.bean.Person;
import spring_02_06_12_basic.basic_08.bean.Pink;
import spring_02_06_12_basic.basic_08.bean.Rabbit;
import spring_02_06_12_basic.basic_08.bean.Red;
import spring_02_06_12_basic.basic_08.config.InjectConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class InjectApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InjectConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);

        System.out.println("==");

        Rabbit rabbit = (Rabbit) ctx.getBean("rabbit");
        System.out.println(rabbit);

        System.out.println("==");
        Pink bean = ctx.getBean(Pink.class);
        System.out.println(bean); // 输出包扫描 使用@Value实现属性注入

        System.out.println("==");
        Red bean1 = ctx.getBean(Red.class);
        System.out.println(bean1);
    }
}
