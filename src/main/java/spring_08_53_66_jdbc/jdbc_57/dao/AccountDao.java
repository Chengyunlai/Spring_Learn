package spring_08_53_66_jdbc.jdbc_57.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class AccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addMoney(Integer userId, int money) {
        jdbcTemplate.update("update tbl_account set money = money + ? where user_id = ?", money, userId);
    }

    public void subtractMoney(Integer userId, int money) {
        jdbcTemplate.update("update tbl_account set money = money - ? where user_id = ?", money, userId);
    }
}
