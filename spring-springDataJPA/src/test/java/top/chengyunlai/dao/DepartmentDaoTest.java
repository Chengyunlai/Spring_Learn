package top.chengyunlai.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import top.chengyunlai.bean.Department;
import top.chengyunlai.config.SpringDataJPAConfig;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringDataJPAConfig.class)
public class DepartmentDaoTest {
    @Autowired
    DepartmentDao departmentDao;

    @Test
    public void testSave() {
        Department department = new Department();
        department.setName("test department");
        department.setTel("1122334");
        departmentDao.save(department);
    }

    @Test
    public void testFindAll() {
        System.out.println("testFindAll ......");
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
    }
}