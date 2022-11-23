package spring_03_14_21_upper.advance_18.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import spring_03_14_21_upper.advance_18.annotation.ConditionalOnBean;
import spring_03_14_21_upper.advance_18.bean.Bar;
import spring_03_14_21_upper.advance_18.bean.Boss;
import spring_03_14_21_upper.advance_18.utils.ExistBossCondition;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class BarConfiguration {

    // 酒吧的创建有一定的要求@Conditional(写清楚条件) ExistBossCondition是我们的规则类
    // @Conditional(ExistBossCondition.class)
    // @ConditionalOnBean(beanNames = "spring_03_14_21_upper.advance_18.bean.Boss")
    @ConditionalOnBean(Boss.class)
    @Bean
    public Bar barrr(){
        return new Bar();
    }
}
