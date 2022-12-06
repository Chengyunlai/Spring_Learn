package spring_08_53_66_jdbc.jdbc_55.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import spring_08_53_66_jdbc.jdbc_55.bean.User;
import spring_08_53_66_jdbc.jdbc_55.dao.UserDao;

import java.util.List;

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
    UserDao userDao;

    @Autowired
    TransactionTemplate transactionTemplate;

    public void saveAndQuery() {
        User user = new User();
        user.setName("阿巴阿巴");
        user.setTel("123654789");
        //
        // userDao.save(user);
        //
        // int i = 1 / 0;
        // transactionTemplate.execute(status -> {
        //     userDao.save(user);
        //
        //     int i = 1 / 0;
        //
        //     List<User> userList = userDao.findAll();
        //     System.out.println(userList);
        //     return null;
        // });

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                userDao.save(user);
                int i = 1 / 0;
            }
        });

        // List<User> userList = userDao.findAll();
        // System.out.println(userList);
    }
}
