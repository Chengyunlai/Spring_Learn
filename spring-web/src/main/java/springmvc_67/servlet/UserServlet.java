package springmvc_67.servlet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;
import springmvc_67.service.UserService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    public UserServlet(UserService userService) {
        this.userService = userService;
    }

    public UserServlet() {
    }

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = userService.get();
        resp.getWriter().println(user);
        // System.out.println("11");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        // WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        // this.userService = ctx.getBean(UserService.class);
        // 优化方法
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, servletContext);
    }
}
