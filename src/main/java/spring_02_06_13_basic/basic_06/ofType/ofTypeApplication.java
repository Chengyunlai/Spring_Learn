package spring_02_06_13_basic.basic_06.ofType;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_02_06_13_basic.basic_06.ofType.annotation.bean.Pink;
import spring_02_06_13_basic.basic_06.ofType.annotation.color.Color;
import spring_02_06_13_basic.basic_06.ofType.dao.DemoDao;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ofTypeApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basic/ofType06.xml");
        Map<String, DemoDao> beansOfType = context.getBeansOfType(DemoDao.class); // 根据实现接口或者父类 找出一系列的类
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Color.class); // 根据注解的类型
        String[] beanDefinitionNames = context.getBeanDefinitionNames(); // 找出容器管理的所有的Bean
        ObjectProvider<Pink> beanProvider = context.getBeanProvider(Pink.class); // 延迟查找

        beansOfType.forEach((name,bean)->{
            System.out.println(name + " " + bean);
        });

        System.out.println("===");

        beansWithAnnotation.forEach((name,bean)->{
            System.out.println(name + " "+ bean) ;
        });
        System.out.println("===");
        Stream.of(beanDefinitionNames).forEach(System.out::println);

        System.out.println("===");
        // 延迟查找时(如果有这个对象) 具体使用,没有则不会报错，但不执行方法
        beanProvider.ifAvailable(pink -> System.out.println(pink));

        // 延迟查找 如果没有则new对象，如果有从容器中拿取对象
        Pink pink = beanProvider.getIfAvailable(() -> new Pink());
        System.out.println(pink);
    }
}