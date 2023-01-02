package juejin.assemblyModules.config;

import juejin.Conditional.ExistCondition;
import juejin.assemblyModules.bean.Dog;
import juejin.assemblyModules.bean.Pig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

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
    @Profile("city")
    public Pig pig(){
        return new Pig();
    }

    @Bean
    @Conditional(ExistCondition.class)
    public Dog dog(){
        return new Dog();
    }
}
