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
public class OrderDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void overbooking(String orderName){
        jdbcTemplate.update("insert into `order` (ordername) values (?)",orderName);
    }
}
