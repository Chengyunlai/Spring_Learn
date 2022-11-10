package spring_02_06_12_basic.basic_09.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring_02_06_12_basic.basic_09.bean.dao.Dao;

import javax.annotation.Resource;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Component
public class ServiceImpl {

    DaoImpl dao;
    Dao daoImpl;

    @Autowired
    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

    @Resource(name = "oracleDaoImpl")
    public void setDaoImpl(Dao daoImpl) {
        this.daoImpl = daoImpl;
    }

    public void getPerson(){
        Person person = dao.getPerson();
        System.out.println(person);
    }
}
