package spring_07_45_47_upper;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_07_45_47_upper.config.TransactionAspectConfiguration;
import spring_07_45_47_upper.service.FinanceService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class TransactionApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                TransactionAspectConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.transfer(1L, 2L, 100);
    }
}
