package spring_08_53_66_jdbc.jdbc_53.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import spring_08_53_66_jdbc.jdbc_53.anno.bean.User;
import spring_08_53_66_jdbc.jdbc_53.anno.config.JdbcTemplateConfig;

import java.util.List;

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
        // jdbcTemplate.execute("insert into tbl_account (user_id, money) values (5, 500)");
        // 插入
        int row1 = jdbcTemplate.update("insert into tbl_user (name, tel) values (?, ?)", "heihei", "200");
        System.out.println(row1);

        // 更新
        int row2 = jdbcTemplate.update("update tbl_user set tel = ? where name = ?", "54321", "heihei");
        System.out.println(row2);

        // 删除
        int row3 = jdbcTemplate.update("delete from tbl_user where name = ?", "heihei");
        System.out.println(row3);

        // 查询全部
        List<User> query = jdbcTemplate.query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
        query.forEach(System.out::println);

        System.out.println("===");

        // 条件查询
        List<User> query2 = jdbcTemplate.query("select * from tbl_user where id > ?", new BeanPropertyRowMapper<>(User.class),2);
        query2.forEach(System.out::println);

        System.out.println("查询单个");
        User user = query2.size() > 0 ? query2.get(0) : null;
        System.out.println(user);

        System.out.println("查询数量");
        // 查询数量
        // JdbcTemplate 给我们提供了一些新的方法：queryForObject ，它可以直接指定返回数据要封装的类型。
        Long count = jdbcTemplate.queryForObject("select count(id) from tbl_user", Long.class);
        System.out.println(count);
    }
}
