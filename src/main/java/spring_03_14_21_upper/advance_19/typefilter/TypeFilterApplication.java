package spring_03_14_21_upper.advance_19.typefilter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_19.typefilter.config.TypeFilterConfig;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TypeFilterApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TypeFilterConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
