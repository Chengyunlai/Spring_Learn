package spring_02_06_13_basic.basic_13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import spring_02_06_13_basic.basic_13.bean.annotation.Person;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_02_06_13_basic.basic_13.bean")
@ImportResource("basic/iniAndDesFunction13.xml")
public class InitAndDestoryConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        Person person = new Person();
        person.setName("annotation");
        return person;
    }
}
