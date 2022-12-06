package spring_08_53_66_jdbc.jdbc_53.quickstart;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcTemplateQuickstartApplication {
    public static void main(String[] args) throws Exception {
        // 数据源;SpringFramework 有给我们提供一个数据源的模型类;DriverManagerDataSource 的底层就是 DriverManager.getConnection()
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?characterEncoding=utf8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        // 并没有连接池的设计，所以性能比较差，真正的开发中可千万不要用它！

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        jdbcTemplate.execute("insert into tbl_user (name, tel) values ('hahaha', '12345')");
    }
}
