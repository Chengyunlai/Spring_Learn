package spring_06_40_43_basic.basic_40.bean;

import spring_06_40_43_basic.basic_40.inter.Partner;
import spring_06_40_43_basic.basic_40.inter.impl.IndividualPartner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName
 * @Description 创建陪玩的游戏平台
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class PartnerPlatform {
    // 用来存储陪玩的选手
    private static List<Partner> partners = new ArrayList<>();

    // 静态初始化
    static {
        partners.add(new IndividualPartner("肖洁洁"));
        partners.add(new IndividualPartner("田苟"));
        partners.add(new IndividualPartner("高总裁"));
    }

    // 根据玩家的预算，推荐合适的陪玩，根据接口来
    public static Partner getPartner(int money) {
        Partner partner = partners.remove(0);
        // return (Partner) Proxy.newProxyInstance(partner.getClass().getClassLoader(), partner.getClass().getInterfaces(), ......);
        return (Partner) Proxy.newProxyInstance(partner.getClass().getClassLoader(), partner.getClass().getInterfaces(),
                new InvocationHandler() {
                    private int budget = money;
                    private boolean status = false;

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("receiveMoney")) {
                            int money = (int) args[0];
                            System.out.println("付款:" + money);
                            // 平台需要运营，抽成一半
                            args[0] = money / 2;
                            // 如果在付钱时没给够，则标记budget为异常值
                            this.status = money >= budget;
                        }
                        if (status) {
                            return method.invoke(partner, args);
                        }
                        return null;
                    }
                });
    }
}
