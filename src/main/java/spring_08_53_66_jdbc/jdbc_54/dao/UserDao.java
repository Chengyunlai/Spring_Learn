package spring_08_53_66_jdbc.jdbc_54.dao;

import spring_08_53_66_jdbc.jdbc_54.bean.User;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public interface UserDao {
    void save(User user);
    User findById(Integer id);
    List<User> findAll();
}
