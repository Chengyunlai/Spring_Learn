package juejin.autowrite.dao.impl;

import juejin.autowrite.dao.Dao;
import org.springframework.stereotype.Component;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class MysqlDaoImpl implements Dao {
    @Override
    public String getUserNameById() {
        return "mysql";
    }
}
