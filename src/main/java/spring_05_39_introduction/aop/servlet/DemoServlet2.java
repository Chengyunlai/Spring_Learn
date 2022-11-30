package spring_05_39_introduction.aop.servlet;

import spring_05_39_introduction.aop.factor.BeanFactory;
import spring_05_39_introduction.aop.service.DemoService;
import spring_05_39_introduction.aop.service.impl.DemoServiceDecorator;
import spring_05_39_introduction.aop.service.impl.DemoServiceImpl;
import spring_05_39_introduction.aop.utils.LogUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Proxy;

/**
 * @ClassName
 * @Description
 * 【问题】模拟需求变更
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/demo2") // 使用@WebServlet注解处理请求路径为/demo1的请求，当请求方法为get时，执行doGet方法
public class DemoServlet2 extends HttpServlet {
    DemoService demoService = new DemoServiceImpl();
    // DemoService demoService = new DemoServiceDecorator((DemoService) BeanFactory.getBean("demoService"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.getWriter().println("DemoServlet1 run ......");
        resp.getWriter().println(demoService.findAll().toString());
        demoService.add("bearbear", 666);
        demoService.subtract("bearbear", 666);
    }

    @Override
    public void init() throws ServletException {
        DemoService demoService = (DemoService) BeanFactory.getBean("demoService");
        Class<? extends DemoService> clazz = demoService.getClass();
        // 使用jdk动态代理，生成代理对象
        this.demoService = (DemoService) Proxy
                .newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), (proxy, method, args) -> {
                    LogUtils.printLog("DemoService", method.getName(), args);
                    return method.invoke(demoService, args);
                });
    }
}
