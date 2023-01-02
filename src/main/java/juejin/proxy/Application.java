package juejin.proxy;

import juejin.proxy.bean.FactoryClothes;
import juejin.proxy.inte.FactoryInterface;
import juejin.proxy.invoke.ProxyFactory;

import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class Application {
    public static void main(String[] args) {
        FactoryClothes factoryClothes = new FactoryClothes();
        FactoryInterface proxy = (FactoryInterface) Proxy.newProxyInstance(FactoryInterface.class.getClassLoader(), FactoryClothes.class.getInterfaces(), new ProxyFactory(factoryClothes));
        proxy.getClothes();
    }
}
