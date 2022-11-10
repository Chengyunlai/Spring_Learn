package spring_02_06_12_basic.basic_09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_02_06_12_basic.basic_09.bean.ServiceImpl;
import spring_02_06_12_basic.basic_09.bean.dao.Dao;
import spring_02_06_12_basic.basic_09.complexInject.PersonAnnotation;
import spring_02_06_12_basic.basic_09.complexInject.PersonXml;

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
