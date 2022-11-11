package spring_02_06_12_basic.basic_12.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_02_06_12_basic.basic_12.bean.Person;
import spring_02_06_12_basic.basic_12.bean.StaticCat;
import spring_02_06_12_basic.basic_12.bean.instanceFactory.InstanceFactory;
import spring_02_06_12_basic.basic_12.bean.staticFactory.StaticFactory;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_02_06_12_basic.basic_12.bean")
public class FactoryConfig {

    @Bean
    public StaticCat getCat(){
        return StaticFactory.getCar();
    }

    @Bean
    // @Scope("prototype")
    @Autowired
    public Person getPerson(InstanceFactory instanceFactory){
        return instanceFactory.getPerson();
    }


}
