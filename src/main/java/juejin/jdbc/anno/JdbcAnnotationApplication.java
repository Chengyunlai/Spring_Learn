package juejin.jdbc.anno;

import juejin.jdbc.anno.config.JdbcAnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class JdbcAnnotationApplication {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcAnnotationConfig.class);
        DriverManagerDataSource bean = ctx.getBean(DriverManagerDataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
    }
}
