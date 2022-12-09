package juejin.propagation.service;

import juejin.propagation.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
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
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class OrdersService {
    @Autowired
    OrderDao orderDao;

    @Autowired
    PayingService payingService;

    public void overbooking(String orderName){
        orderDao.overbooking(orderName);
        payingService.paying(100);
    }
}
