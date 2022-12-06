package spring_08_53_66_jdbc.jdbc_54.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import spring_08_53_66_jdbc.jdbc_54.bean.User;
import spring_08_53_66_jdbc.jdbc_54.dao.UserDao;
import spring_08_53_66_jdbc.jdbc_54.dao.baseDao.BaseDao;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    // @Autowired
    // private JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        // jdbcTemplate.update("insert into tbl_user (name,tel) values (?,?)",user.getName(),user.getTel());
        this.getJdbcTemplate().update("insert into tbl_user (name,tel) values (?,?)",user.getName(),user.getTel());
    }

    @Override
    public User findById(Integer id) {
        // List<User> query = jdbcTemplate.query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        List<User> query = this.getJdbcTemplate().query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        return query.size() > 0 ? query.get(0) : null;
    }

    @Override
    public List<User> findAll() {
        // List<User> query = jdbcTemplate.query("select * from tbl_user;", new BeanPropertyRowMapper<>(User.class));
        List<User> query = this.getJdbcTemplate().query("select * from tbl_user;", new BeanPropertyRowMapper<>(User.class));
        return query;
    }
}
