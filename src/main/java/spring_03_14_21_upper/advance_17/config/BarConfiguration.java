package spring_03_14_21_upper.advance_17.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_03_14_21_upper.advance_17.bean.Bar;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class BarConfiguration {

    @Bean
    public Bar barrr(){
        return new Bar();
    }
}
