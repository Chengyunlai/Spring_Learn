package spring_01_03_05_introduction.introduction_04_05_di.basic_dl.byName;

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("introduction/quickstart-byname.xml");
        Person person = (Person) context.getBean(Person.class);
        System.out.println(person);
    }
}
