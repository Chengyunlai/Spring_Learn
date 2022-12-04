package spring_06_40_43_basic.basic_43.aop.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_06_40_43_basic.basic_43.aop.anno.config.AspectJAOPConfiguration;
import spring_06_40_43_basic.basic_43.aop.anno.service.FinanceService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class AnnotationAspectJApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(123.45);
        financeService.subtractMoney(543.21);
        financeService.getMoneyById("abc");
        financeService.subtractMoney(10,"10");
    }
}
