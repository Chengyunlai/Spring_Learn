package juejin.autowrite.dao.impl;

import juejin.autowrite.dao.Dao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OracleDaoImpl implements Dao {
    @Override
    public String getUserNameById() {
        return "oracle";
    }
}
