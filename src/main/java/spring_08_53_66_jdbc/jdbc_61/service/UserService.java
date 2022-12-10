package spring_08_53_66_jdbc.jdbc_61.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_08_53_66_jdbc.jdbc_61.bean.User;
import spring_08_53_66_jdbc.jdbc_61.dao.UserDao;


/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class UserService {
    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Autowired
    UserDao userDao;

    @Transactional
    public void saveUser() {
        User user = new User();
        user.setName("哈哈哈");
        user.setTel("123");

        userDao.save(user);
        eventPublisher.publishEvent(user);
    }
}
