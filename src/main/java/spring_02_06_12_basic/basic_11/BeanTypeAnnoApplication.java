package spring_02_06_12_basic.basic_11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_12_basic.basic_11.bean.Ball;
import spring_02_06_12_basic.basic_11.bean.Toy;
import spring_02_06_12_basic.basic_11.config.BeanTypeConfiguration;

import java.util.Map;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BeanTypeAnnoApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);
        // Toy toy = ctx.getBean(Toy.class); //Spring容器里有BeanFactory 和 FactoryBean给的两个
        // System.out.println(toy);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("==");
        Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
        toys.forEach((name, toy) -> {
            System.out.println("toy name : " + name + ", " + toy.toString());
        });

        // 工厂本身创建的内容 并不归于Spring容器管理
        // Ball bean = ctx.getBean(Ball.class);
        // System.out.println(bean);

    }
}
