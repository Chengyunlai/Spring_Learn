package top.chengyunlai.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@EnableTransactionManagement
@ComponentScan("top.chengyunlai")
public class ApplicationConfig {
    @Bean
    public DriverManagerDataSource getDriverManagerDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(getDriverManagerDataSource());
        return dataSourceTransactionManager;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean getSqlSessionFactoryBean(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(getDriverManagerDataSource());
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:SqlMapConfig.xml"));
        return sqlSessionFactoryBean;
    }

    // @Bean
    // public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
    //     SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
    //     return sqlSessionTemplate;
    // }

    // @Bean
    // public MapperFactoryBean getMapperFactoryBean(){
    //     MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();
    //     mapperFactoryBean.setMapperInterface(DepartmentMapper.class);
    //     mapperFactoryBean.setSqlSessionFactory((SqlSessionFactory) getSqlSessionFactoryBean());
    //     return mapperFactoryBean;
    // }
    // @Bean
    // public MapperFactoryBean<DepartmentMapper> departmentMapper(SqlSessionFactory sqlSessionFactory) {
    //     MapperFactoryBean<DepartmentMapper> departmentMapperFactoryBean = new MapperFactoryBean<>();
    //     departmentMapperFactoryBean.setMapperInterface(DepartmentMapper.class);
    //     departmentMapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
    //     return departmentMapperFactoryBean;
    // }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("top.chengyunlai.mapper");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
