package spring_06_40_43_basic.basic_42.service;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class FinanceService {
    public void addMoney(double money) {
        System.out.println("FinanceService 收钱 === " + money);
    }

    public double subtractMoney(double money) {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }

    public double subtractMoney(double money,String id) {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }

    public double getMoneyById(String id) {
        System.out.println("FinanceService 查询账户，id为" + id);
        return Math.random();
    }
}
