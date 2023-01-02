package juejin.proxy.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class ProxyFactory implements InvocationHandler {
    Object obj;

    // 传入被代理对象
    public ProxyFactory(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理人执行");
        // 拦截其执行方法，通过反射的方式让Target类执行方法
        Object object = method.invoke(obj, args);
        System.out.println("代理人执行结束");
        return object;
    }
}
