package juejin.beanLife.anno.config;

import juejin.beanLife.anno.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class BeanLifeConfig {
    @Bean(initMethod = "addHp",destroyMethod = "reduceHp")
    public Person person(){
        return new Person();
    }
}
