package juejin.assemblyModules.config;

import juejin.assemblyModules.bean.Pig;
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
public class AssemblyConfig {
    @Bean
    public Pig pig(){
        return new Pig();
    }
}
