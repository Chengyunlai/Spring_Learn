package spring_04_22_31_expert.expert_25.config;

import org.springframework.context.annotation.*;
import spring_04_22_31_expert.expert_25.bean.Person;
import spring_04_22_31_expert.expert_25.postProcessor.RemoveBeanDefinitionPostProcessor;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@Import(RemoveBeanDefinitionPostProcessor.class)
// @ComponentScan("spring_04_22_31_expert.expert_25.bean")
@ImportResource("expert/postProcessor.xml")
public class BeanDefinitionRegistryConfiguration {
    // @Bean
    // public Person person(){
    //     Person person = new Person();
    //     person.setName("王五");
    //     // spring容器会删除sex为male的bean
    //     person.setSex("male");
    //     return person;
    // }
}
