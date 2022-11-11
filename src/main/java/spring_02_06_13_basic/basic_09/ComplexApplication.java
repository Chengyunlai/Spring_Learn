package spring_02_06_13_basic.basic_09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_02_06_13_basic.basic_09.complexInject.PersonAnnotation;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ComplexApplication {

    public static void main(String[] args) {
        // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("spring_02_06_12_basic.basic_09.bean");
        //
        // ServiceImpl bean = ctx.getBean(ServiceImpl.class);
        // bean.getPerson();

        // Dao bean1 = ctx.getBean(Dao.class);
        // System.out.println(bean1);

        // 复杂注入XML
        // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("basic/complexPerson.xml");
        // PersonXml bean = ctx.getBean(PersonXml.class);
        // System.out.println(bean);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("spring_02_06_12_basic.basic_09.complexInject");
        PersonAnnotation bean = ctx.getBean(PersonAnnotation.class);
        System.out.println(bean);

    }
}
