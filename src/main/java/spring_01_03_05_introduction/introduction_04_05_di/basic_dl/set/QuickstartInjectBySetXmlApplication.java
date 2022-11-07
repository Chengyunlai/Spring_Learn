package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01_03_05_introduction.introduction_04_05_di.basic_dl.set.bean.Cat;
import spring_01_03_05_introduction.introduction_04_05_di.basic_dl.set.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartInjectBySetXmlApplication {
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_di/inject-set.xml");
        Person person = beanFactory.getBean(Person.class);
        System.out.println(person);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
