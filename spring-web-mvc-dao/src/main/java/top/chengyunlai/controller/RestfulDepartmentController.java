package top.chengyunlai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.chengyunlai.bean.Department;
import top.chengyunlai.service.DepartmentService;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Controller
@RequestMapping("/rest")
public class RestfulDepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/{id}")
    @ResponseBody
    public Department findById(@PathVariable("id") String id) {
        System.out.println("get");
        Department byId = departmentService.findById(id);
        System.out.println(byId);
        return byId;
    }

    @PostMapping("/")
    public void save(Department department) {
        departmentService.save(department);
    }

    @PutMapping("/{id}")
    public void update(Department department, @PathVariable("id") String id) {
        // update ......
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        departmentService.deleteById(id);
    }
}
