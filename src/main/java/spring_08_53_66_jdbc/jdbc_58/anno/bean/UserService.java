package spring_08_53_66_jdbc.jdbc_58.anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class UserService {

    @Autowired
    PointService pointService;
    @Transactional
    public void register() {
        // 持久化操作 ......
        System.out.println("register 注册用户 ......");
        pointService.addPoint();
    }
}
