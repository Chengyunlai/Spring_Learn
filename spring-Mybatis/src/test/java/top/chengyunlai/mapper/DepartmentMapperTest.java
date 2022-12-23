package top.chengyunlai.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import top.chengyunlai.bean.Department;
import top.chengyunlai.config.ApplicationConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class DepartmentMapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    public void testMapperSave() {
        Department department = new Department();
        department.setName("mybatis mapper name");
        department.setTel("mybatis mapper tel");
        departmentMapper.save(department);
    }

    @Test
    public void testMapperFindAll() {
        System.out.println(departmentMapper.findAll());
    }
}