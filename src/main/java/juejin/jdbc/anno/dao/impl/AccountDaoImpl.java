package juejin.jdbc.anno.dao.impl;

import juejin.jdbc.anno.dao.AccountDao;
import juejin.jdbc.anno.dao.base.BaseDao;
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
