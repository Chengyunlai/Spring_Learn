package top.chengyunlai.service;

import top.chengyunlai.bean.User;
import top.chengyunlai.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    UserDao userDao;

    public void update(User user) {
        userDao.update(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    public User findById(String id) {
        return userDao.findById(id);
    }
}