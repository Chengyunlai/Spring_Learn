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
public abstract class AbstractDemoService implements DemoService {
    @Override
    public List<String> findAll() {
        return null;
    }

    // 子类负责业务功能实现
    protected abstract int doAdd(String userId, int points);

    @Override
    public int add(String userId, int points) {
        // 父类执行额外的逻辑
        LogUtils.printLog("DemoService", "add", userId, points);
        return doAdd(userId, points);
    }

    @Override
    public int subtract(String userId, int points) {
        return 0;
    }

    @Override
    public int multiply(String userId, int points) {
        return 0;
    }

    @Override
    public int divide(String userId, int points) {
        return 0;
    }
}
