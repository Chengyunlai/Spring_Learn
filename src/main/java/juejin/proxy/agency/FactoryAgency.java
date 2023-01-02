package juejin.proxy.agency;

import juejin.proxy.bean.FactoryClothes;
import juejin.proxy.inte.FactoryInterface;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class FactoryAgency implements FactoryInterface {
    FactoryClothes factoryClothes;

    public FactoryAgency(FactoryClothes factoryClothes) {
        this.factoryClothes = factoryClothes;
    }

    public void getClothes(){
        System.out.println("代理人执行");
        factoryClothes.getClothes();
        System.out.println("代理人执行结束");
    }
}
