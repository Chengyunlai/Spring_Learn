package juejin.autowrite.service.impl;

import juejin.autowrite.dao.Dao;
import juejin.autowrite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    private Dao dao;

    @Resource(name = "${daoName}")
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public String getUserNameByID() {
        return dao.getUserNameById();
    }
}
