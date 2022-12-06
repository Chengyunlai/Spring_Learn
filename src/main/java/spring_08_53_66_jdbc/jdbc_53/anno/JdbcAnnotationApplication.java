package spring_08_53_66_jdbc.jdbc_53.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import spring_08_53_66_jdbc.jdbc_53.anno.config.JdbcTemplateConfig;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcAnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcTemplateConfig.class);
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        jdbcTemplate.execute("insert into tbl_account (user_id, money) values (5, 500)");
    }
}
