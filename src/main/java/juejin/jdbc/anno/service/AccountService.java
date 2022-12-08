package juejin.jdbc.anno.service;

import juejin.jdbc.anno.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
@Transactional
public class AccountService {

    @Autowired
    AccountDao accountDao;
    // 一个交易方法
    public void deal(){
        accountDao.addMoney(1,100);
        int i = 1 / 0;
        accountDao.reduceMoney(2,100);
    }
}