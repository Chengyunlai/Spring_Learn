package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.byName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_01_03_05_introduction.introduction_04_05_di.basic_dl.byName.bean.Person;

/**
 * @ClassName
 * @Description 读basic_di配置文件
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class QuickstartByNameApplication {
    public static void main(String[] args) throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dI/quickstart-byname.xml");
        Person person = (Person) factory.getBean(Person.class);
        System.out.println(person);
    }
}
