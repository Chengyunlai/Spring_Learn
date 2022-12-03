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
public class DemoServiceImpl implements DemoService {

    // private DemoDao demoDao = new DemoDaoImpl();

    // 不再手动new，而是去factory里拿对象【这里解决底层代码变动时，Service里的代码不用动】
    private DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

    // 问题1：这些日志的打印，它们的逻辑几乎都是一样
    // 问题2：每个方法还是得写 LogUtils.printLog 方法
    @Override
    public int add(String userId, int points) {
        // System.out.println("DemoServiceImpl add ...");
        // System.out.println("user: " + userId + ", points: " + points);
        // LogUtils.printLog("DemoServiceImpl", "add", userId, points);
        return points;
    }

    @Override
    public int subtract(String userId, int points) {
        // System.out.println("DemoServiceImpl subtract ...");
        // System.out.println("user: " + userId + ", points: " + points);
        // LogUtils.printLog("DemoServiceImpl", "subtract", userId, points);
        return points;
    }

    @Override
    public int multiply(String userId, int points) {
        // System.out.println("DemoServiceImpl multiply ...");
        // System.out.println("user: " + userId + ", points: " + points);
        // LogUtils.printLog("DemoServiceImpl", "multiply", userId, points);
        return points;
    }

    @Override
    public int divide(String userId, int points) {
        // System.out.println("DemoServiceImpl divide ...");
        // System.out.println("user: " + userId + ", points: " + points);
        // LogUtils.printLog("DemoServiceImpl", "divide", userId, points);
        return points;
    }
}
