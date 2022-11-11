package spring_02_06_13_basic.basic_07.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import spring_02_06_13_basic.basic_07.annotation.bean.Cat;
import spring_02_06_13_basic.basic_07.annotation.bean.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_02_06_13_basic.basic_07.annotation.bean")
//加入xml的配置
@ImportResource("basic/annotation07.xml")
public class ApplicationConfig {

    // 对应注解文件中的 <bean>标签
    // 可以直接在 `@Bean` 注解上显式的声明 Bean 的 id ，只不过在注解驱动的范畴里，它不叫 id 而是叫 **name**
    @Bean("MyPerson")
    public Person person(){
        Person person = new Person();
        person.setPersonName("Chengyunlai");
        person.setAge(18);
        return person;
    }

    @Bean("MyCat")
    public Cat cat(){
        Cat cat = new Cat();
        cat.setCatName("小黑");
        // 直接拿上面的person()方法作为返回值即可，相当于ref
        cat.setMaster(person());
        return cat;
    }

}
