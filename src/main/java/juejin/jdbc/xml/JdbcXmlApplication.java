package juejin.jdbc.xml;

import juejin.jdbc.xml.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcXmlApplication {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("juejin/jdbcApo/jdbc.xml");
        AccountService service = ctx.getBean(AccountService.class);
        service.deal();
    }
}
