package juejin.jdbc.xml.dao.impl;

import juejin.jdbc.xml.dao.AccountDao;
import juejin.jdbc.xml.dao.base.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class AccountDaoImpl extends BaseDao implements AccountDao {

    @Override
    public void addMoney(Integer id,Integer num) {
        this.getJdbcTemplate().update("UPDATE account SET money = money + ? WHERE  id = ?",num,id);
    }

    @Override
    public void reduceMoney(Integer id,Integer num) {
        this.getJdbcTemplate().update("UPDATE account SET money = money - ? WHERE  id = ?",num,id);
    }
}
