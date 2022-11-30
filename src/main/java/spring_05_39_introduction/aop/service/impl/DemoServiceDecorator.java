package spring_05_39_introduction.aop.service.impl;

import spring_05_39_introduction.aop.service.DemoService;
import spring_05_39_introduction.aop.utils.LogUtils;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class DemoServiceDecorator implements DemoService {
    private DemoService target;

    // 构造方法中需要传入被装饰的原对象
    public DemoServiceDecorator(DemoService target) {
        this.target = target;
    }

    @Override
    public List<String> findAll() {
        return target.findAll();
    }

    @Override
    public int add(String userId, int points) {
        // 在原对象执行方法之前打印日志，完成日志与业务逻辑的分离
        LogUtils.printLog("DemoService", "add", userId, points);
        return target.add(userId, points);
    }

    @Override
    public int subtract(String userId, int points) {
        LogUtils.printLog("DemoService", "subtract", userId, points);
        return target.subtract(userId, points);
    }

    @Override
    public int multiply(String userId, int points) {
        LogUtils.printLog("DemoService", "multiply", userId, points);
        return target.multiply(userId, points);
    }

    @Override
    public int divide(String userId, int points) {
        LogUtils.printLog("DemoService", "divide", userId, points);
        return target.divide(userId, points);
    }
}
