package spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean.Ball;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = {"spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor.bean","spring_04_22_31_expert.expert_27.instantiationAwareBeanPostProcessor"})
public class InstantiationProcessorConfig {
    @Bean("ball2")
    public Ball ball(){
        return new Ball();
    }
}
