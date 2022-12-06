package spring_08_53_66_jdbc.jdbc_54.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import spring_08_53_66_jdbc.jdbc_54.bean.User;
import spring_08_53_66_jdbc.jdbc_54.dao.UserDao;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class UserDaoImpl2 extends JdbcDaoSupport implements UserDao {
    @Override
    public void save(User user) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
