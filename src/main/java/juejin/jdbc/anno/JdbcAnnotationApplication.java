package juejin.jdbc.anno;

import juejin.jdbc.anno.config.JdbcAnnotationConfig;
import juejin.jdbc.anno.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcAnnotationApplication {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcAnnotationConfig.class);
        AccountService service = ctx.getBean(AccountService.class);
        service.deal();
    }
}
