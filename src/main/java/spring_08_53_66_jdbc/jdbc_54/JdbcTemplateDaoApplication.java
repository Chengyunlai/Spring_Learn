package spring_08_53_66_jdbc.jdbc_54;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_08_53_66_jdbc.jdbc_54.config.JdbcTemplateConfig;
import spring_08_53_66_jdbc.jdbc_54.dao.UserDao;
import spring_08_53_66_jdbc.jdbc_54.dao.impl.UserDaoImpl;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcTemplateDaoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcTemplateConfig.class);
        UserDao userDao = ctx.getBean(UserDaoImpl.class);
        userDao.findAll().forEach(System.out::println);
    }
}
