package spring_04_22_31_expert.expert_23.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ComponentScan("spring_04_22_31_expert.expert_23.bean")
@PropertySource("expert/environment.properties")
public class EnvironmentPropertyConfiguration {
}
