package spring_06_40_43_basic.basic_42;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_06_40_43_basic.basic_42.service.FinanceService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class XmlAspectApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop_basic/xmlaspect.xml");
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(123.45);
        System.out.println(financeService.getMoneyById("abc"));
    }
}
