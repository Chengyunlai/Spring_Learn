package top.chengyunlai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.chengyunlai.bean.Cat;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class JunitConfig {
    @Bean
    public Cat getCat(){
        Cat cat = new Cat();
        return cat;
    }
}
