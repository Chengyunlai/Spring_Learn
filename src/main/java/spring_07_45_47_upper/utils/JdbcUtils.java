package spring_07_45_47_upper.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class JdbcUtils {
    // 使用 ThreadLocal ，可以实现一个线程中的对象资源共享！
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/spring?characterEncoding=utf8&useSSL=false";

    // public static Connection getConnection() {
    //     // ThreadLocal中有，直接取出返回
    //     if (threadLocal.get() != null){
    //         return threadLocal.get();
    //     }
    //
    //     // 没有，则创建新的，并放入ThreadLocal中
    //     Connection connection;
    //     try {
    //         connection = DriverManager.getConnection(JDBC_URL, "root", "root");
    //         threadLocal.set(connection);
    //     } catch (SQLException e) {
    //         throw new RuntimeException(e);
    //     }
    //     return connection;
    // }

    public static Connection openConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(JDBC_URL, "root", "123456");
            threadLocal.set(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Connection getConnection() {
        if (threadLocal.get() != null) {
            return threadLocal.get();
        }
        return openConnection();
    }

    public static void remove() {
        threadLocal.remove();
    }
}
