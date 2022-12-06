package spring_08_53_66_jdbc.jdbc_53.anno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @ClassName
 * @Description 注册bean
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
public class JdbcTemplateConfig {
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(driverManagerDataSource());
        return jdbcTemplate;
    }

    @Bean
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring?characterEncoding=utf8&useSSL=false");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
}
