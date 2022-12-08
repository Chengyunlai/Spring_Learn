package spring_08_53_66_jdbc.jdbc_57.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_08_53_66_jdbc.jdbc_57.dao.AccountDao;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;

    @Transactional
    public void transfer(Integer sourceId, Integer targetId, int money) {
        accountDao.subtractMoney(sourceId, money);

        int i = 1 / 0;

        accountDao.addMoney(targetId, money);
    }
}
