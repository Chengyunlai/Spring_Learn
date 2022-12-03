package spring_05_39_introduction.aop.proxy;

import spring_05_39_introduction.aop.utils.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class LogAdvisor implements InvocationHandler {
    private Object target;

    private List<String> methods;

    public LogAdvisor(Object target, String[] methods) {
        this.target = target;
        this.methods = Arrays.asList(methods);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (this.methods.contains(method.getName())) {
            LogUtils.printLog(target.getClass().getName(), method.getName(), args);
        }
        return method.invoke(target,args);
    }
}
