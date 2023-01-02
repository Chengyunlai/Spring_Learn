package top.chengyunlai.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.chengyunlai.bean.Department;

import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class DepartmentDao {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    // @Autowired
    // SqlSessionTemplate sqlSessionTemplate;


    public void save(Department department) {
        // 利用try-with-resource简化编码
        // try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
        //     sqlSession.insert("dept.save", department);
        // }
        // sqlSessionTemplate.insert("dept.save",department);
    }

    public List<Department> findAll() {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            return sqlSession.selectList("dept.findAll");
        }
    }
}
