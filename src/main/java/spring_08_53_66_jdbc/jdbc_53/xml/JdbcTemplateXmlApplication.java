package spring_08_53_66_jdbc.jdbc_53.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcTemplateXmlApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/jdbc.xml");
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);
        jdbcTemplate.execute("insert into tbl_account (user_id, money) values (3, 100)");
    }
}
