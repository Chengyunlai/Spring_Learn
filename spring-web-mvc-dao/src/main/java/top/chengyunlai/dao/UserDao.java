package top.chengyunlai.dao;

import top.chengyunlai.bean.Department;
import top.chengyunlai.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Repository
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int update(User user) {
        StringBuilder sql = new StringBuilder();
        List<Object> params = new ArrayList<>(6);
        sql.append("update tbl_user set username = ?, name = ?, birthday = ?, dept_id = ?");
        params.add(user.getUsername());
        params.add(user.getName());
        params.add(user.getBirthday());
        params.add(user.getDepartment().getId());
        if (user.getPhotoFile() != null) {
            sql.append(", photo = ?");
            params.add(user.getPhotoFile());
        }
        sql.append(" where id = ?");
        params.add(user.getId());
        return jdbcTemplate.update(sql.toString(), params.toArray());
    }

    public List<User> findAllUsers() {
        return jdbcTemplate.query("select usr.*, dept.name as dept_name from tbl_users usr "
                + "left join tbl_dept dept on usr.dept_id = dept.id", new UserRowMapper());
    }

    public User findById(String id) {
        List<User> userList = jdbcTemplate.query("select usr.*, dept.name as dept_name from tbl_users usr "
                + "left join tbl_dept dept on usr.dept_id = dept.id where usr.id = ?", new UserRowMapper(), id);
        return userList.size() > 0 ? userList.get(0) : null;
    }

    // 由于用到了关联查询，BeanPropertyRowMapper无法胜任工作，我们自己定义一个吧
    public static class UserRowMapper implements RowMapper<User> {

        LobHandler lobHandler = new DefaultLobHandler();

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getString("id"));
            user.setUsername(rs.getString("username"));
            user.setName(rs.getString("name"));
            user.setBirthday(rs.getDate("birthday"));
            user.setPhotoFile(lobHandler.getBlobAsBytes(rs, "photo"));
            Department department = new Department();
            department.setId(rs.getString("dept_id"));
            department.setName(rs.getString("dept_name"));
            user.setDepartment(department);
            return user;
        }
    }
}