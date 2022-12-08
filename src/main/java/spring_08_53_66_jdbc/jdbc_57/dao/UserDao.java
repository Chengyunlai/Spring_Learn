package spring_08_53_66_jdbc.jdbc_57.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring_08_53_66_jdbc.jdbc_57.bean.User;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void save(User user) {
        jdbcTemplate.update("insert into tbl_user (name, tel) values (?, ?)", user.getName(), user.getTel());
    }

    public List<User> findAll() {
        return jdbcTemplate.query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
    }
}
