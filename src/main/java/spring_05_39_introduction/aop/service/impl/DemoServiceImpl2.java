package spring_05_39_introduction.aop.service.impl;

import spring_05_39_introduction.aop.dao.DemoDao;
import spring_05_39_introduction.aop.factor.BeanFactory;
import spring_05_39_introduction.aop.service.DemoService;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoServiceImpl2 implements DemoService {

    // private DemoDao demoDao = new DemoDaoImpl();

    // 不再手动new，而是去factory里拿对象【这里解决底层代码变动时，Service里的代码不用动】
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    @Override
    public int add(String userId, int points) {
        return points;
    }

    @Override
    public int subtract(String userId, int points) {
        return points;
    }

    @Override
    public int multiply(String userId, int points) {
        return points;
    }

    @Override
    public int divide(String userId, int points) {
        return points;
    }
}
