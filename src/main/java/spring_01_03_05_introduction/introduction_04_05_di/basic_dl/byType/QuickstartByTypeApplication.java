package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01_03_05_introduction.introduction_04_05_di.basic_dl.byType.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartByTypeApplication {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dI/quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);
    }
}
