// package top.chengyunlai.dao;
//
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit4.SpringRunner;
// import top.chengyunlai.bean.Department;
// import top.chengyunlai.config.ApplicationConfig;
//
// @RunWith(SpringRunner.class)
// @ContextConfiguration(classes = ApplicationConfig.class)
// public class DepartmentDaoTest {
//     @Autowired
//     DepartmentDao departmentDao;
//
//     @Test
//     public void testDaoSave() {
//         Department department = new Department();
//         department.setName("mybatis dao name");
//         department.setTel("mybatis dao tel");
//         departmentDao.save(department);
//     }
//
//     @Test
//     public void testDaoFindAll() {
//         System.out.println(departmentDao.findAll());
//     }
// }