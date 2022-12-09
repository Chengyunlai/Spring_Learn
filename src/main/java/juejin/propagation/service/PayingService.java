package juejin.propagation.service;

import juejin.propagation.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class PayingService {
    @Autowired
    PayDao payDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public void paying(Integer money){
        payDao.paying(money);
        int i = 1/0;
    }
}
