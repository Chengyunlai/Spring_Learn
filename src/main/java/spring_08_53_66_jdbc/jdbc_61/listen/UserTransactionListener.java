package spring_08_53_66_jdbc.jdbc_61.listen;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;
import spring_08_53_66_jdbc.jdbc_61.bean.User;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class UserTransactionListener {

    @TransactionalEventListener
    @Order(1)
    public void onSaveUser(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务准备提交 ......");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    @Order(2)
    public void onSaveUser2(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务提交成功 ......");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    @Order(3)
    public void onSaveUser3(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务回滚 ......");
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    @Order(4)
    public void onSaveUser4(PayloadApplicationEvent<User> event) {
        System.out.println("监听到保存用户事务完成 ......");
    }
}
