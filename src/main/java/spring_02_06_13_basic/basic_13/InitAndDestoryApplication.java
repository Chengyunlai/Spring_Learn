package spring_02_06_13_basic.basic_13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_13_basic.basic_07.annotation.AnnotationApplication;
import spring_02_06_13_basic.basic_13.bean.annotation.Person;
import spring_02_06_13_basic.basic_13.config.InitAndDestoryConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class InitAndDestoryApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(InitAndDestoryConfig.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);
        annotationConfigApplicationContext.close();
    }
}
