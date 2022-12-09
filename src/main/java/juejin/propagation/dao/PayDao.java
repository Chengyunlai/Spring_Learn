package juejin.propagation.dao;

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
public class PayDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void paying(Integer money){
        jdbcTemplate.update("insert into `pay` (pay_money) values (?)",money);
    }
}
