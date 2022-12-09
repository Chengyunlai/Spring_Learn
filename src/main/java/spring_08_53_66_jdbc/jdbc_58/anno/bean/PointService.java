package spring_08_53_66_jdbc.jdbc_58.anno.bean;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class PointService {
    public void addPoint() {
        System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
        System.out.println("addPoint 添加积分 ......");
    }
}
