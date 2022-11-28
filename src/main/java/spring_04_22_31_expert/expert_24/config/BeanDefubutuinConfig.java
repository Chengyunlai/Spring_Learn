package spring_04_22_31_expert.expert_24.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import spring_04_22_31_expert.expert_24.bean.Dog;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_04_22_31_expert.expert_24.bean")
@ImportResource("expert/beanDefinition.xml")
public class BeanDefubutuinConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
