package springmvc_67.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springmvc_67.service.UserService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class UserConfiguration {
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
