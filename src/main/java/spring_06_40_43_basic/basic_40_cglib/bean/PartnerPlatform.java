package spring_06_40_43_basic.basic_40_cglib.bean;



import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
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
        partners.add(new Partner("肖洁洁"));
        partners.add(new Partner("田苟"));
        partners.add(new Partner("高总裁"));
    }

    // 根据玩家的预算，推荐合适的陪玩，根据接口来
    public static Partner getPartner(int money) {
        Partner partner = partners.remove(0);
        // 使用Cglib的Enhancer创建代理对象
        return (Partner) Enhancer.create(partner.getClass(), new MethodInterceptor() {
            private int budget = money;
            private boolean status = false;

            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 如果在付钱时没给够，则标记budget为异常值
                if (method.getName().equals("receiveMoney")) {
                    int money = (int) args[0];
                    System.out.println("付款:"+ money);
                    args[0] = money /2;
                    this.status = money >= budget;
                }
                if (status) {
                    System.out.println(method);
                    return method.invoke(partner, args);
                }
                return null;
            }
        });
    }
}
