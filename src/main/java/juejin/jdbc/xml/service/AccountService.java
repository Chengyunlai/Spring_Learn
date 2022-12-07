package juejin.jdbc.xml.service;

import juejin.jdbc.xml.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
    // 一个交易方法
    public void deal(){
        accountDao.addMoney(1,100);
        int i = 1 / 0;
        accountDao.reduceMoney(2,100);
    }
}