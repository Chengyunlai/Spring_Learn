package juejin.proxy.bean;

import juejin.proxy.inte.FactoryInterface;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class FactoryClothes implements FactoryInterface {
    public void getClothes(){
        System.out.println("生产衣服");
    }
}
