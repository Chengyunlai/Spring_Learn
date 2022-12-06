package spring_08_53_66_jdbc.jdbc_54.dao.baseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName
 * @Description 抽象类就是干一些重复的事
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public abstract class  BaseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
