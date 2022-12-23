package top.chengyunlai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import top.chengyunlai.bean.Department;
import top.chengyunlai.service.DepartmentService;

import javax.servlet.ServletException;
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
@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping("/department/demo")
    public String demo() {
        System.out.println(departmentService);
        return "demo";
    }

    @RequestMapping("/department/list")
    public String list() {
        // deptList 该变量名 将会在JSP中被获取
        request.setAttribute("deptList", departmentService.findDepartments(null));
        return "deptList";
    }

    // 这个对象中肯定能封装数据和返回跳转的视图咯，所以我们就可以往其中塞入查询到的部门数据，以及跳转的 deptList.jsp页面
    @RequestMapping("/department/list2")
    public ModelAndView list2(ModelAndView mav) {
        mav.addObject("deptList", departmentService.findDepartments(null));
        mav.setViewName("deptList");
        return mav;
    }

    // 模糊查询
    @RequestMapping("/department/list3")
    public String list(@RequestParam(value = "dept_name") String name) {
        request.setAttribute("deptList", departmentService.findDepartmentsByName(name));
        return "deptList";
    }

    @RequestMapping("/department/delete")
    public String delete(String id) {
        departmentService.deleteById(id);
        return "deptList";
    }

    @RequestMapping("/department/edit")
    public String edit(HttpServletRequest request, String id) {
        request.setAttribute("dept", departmentService.findById(id));
        return "deptInfo";
    }

    @RequestMapping("/department/save")
    public void save(Department department) {
        System.out.println(department);
     }

     @RequestMapping("/hello")
    public void hello1(HttpServletRequest request, HttpServletResponse response, Department department) throws ServletException, IOException {
        System.out.println("你的请求将会被转发");

         System.out.println("http://"+request.getServerName() +":"+ request.getServerPort() + request.getContextPath() + "/hello2");
         request.getRequestDispatcher("/hello2").forward(request, response);
     }

    @RequestMapping("/hello2")
    public void hello2(HttpServletRequest request, HttpServletResponse response, Department department) throws ServletException, IOException {
        System.out.println("接收到你的请求");
    }
}
