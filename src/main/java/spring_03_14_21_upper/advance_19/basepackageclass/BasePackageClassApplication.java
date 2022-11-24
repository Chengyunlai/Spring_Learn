package spring_03_14_21_upper.advance_19.basepackageclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_03_14_21_upper.advance_19.basepackageclass.config.BasePackageClassScanConfig;

import java.util.stream.Stream;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class BasePackageClassApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BasePackageClassScanConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(System.out::println);
    }
}
