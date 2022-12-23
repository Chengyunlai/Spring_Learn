package top.chengyunlai.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.chengyunlai.bean.Department;

// 继承 JpaRepository 的目的，是为了让我们写的这个 DepartmentDao 拥有单表增删改查的能力
// 接口上有两个泛型参数，分别指的是单表 CRUD 中操作的表，以及这张表的主键类型。
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
