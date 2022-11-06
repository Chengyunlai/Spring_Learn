package spring_01_03_05_introduction.introduction_03.servlet;

import spring_01_03_05_introduction.introduction_03.service.DemoService;
import spring_01_03_05_introduction.introduction_03.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName
 * @Description
 * 【问题】模拟需求变更
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/demo1") // 使用@WebServlet注解处理请求路径为/demo1的请求，当请求方法为get时，执行doGet方法
public class DemoServlet extends HttpServlet {
    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.getWriter().println("DemoServlet1 run ......");
        resp.getWriter().println(demoService.findAll().toString());
    }
}
