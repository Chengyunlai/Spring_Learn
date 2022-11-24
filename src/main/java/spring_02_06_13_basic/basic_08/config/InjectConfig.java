package spring_02_06_13_basic.basic_08.config;

import org.springframework.context.annotation.*;
import spring_02_06_13_basic.basic_08.bean.Rabbit;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@ImportResource("basic/constructor08.xml")
// @ComponentScan("spring_02_06_12_basic.basic_08.DataSource") // 注释使用XML的方式
// @PropertySource("basic/red08.properties") // 注释掉使用XML的方式constructor08
public class InjectConfig {

    @Bean
    public Rabbit rabbit(){
        return new Rabbit("小兔子",18);
    }

}
