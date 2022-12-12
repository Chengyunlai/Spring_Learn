package top.chengyunlai.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import top.chengyunlai.config.RootConfiguration;
import top.chengyunlai.config.WebMvcConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class SpringWebMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //  Service 、Dao 等类都放到根容器
    // Servlet 子容器只能扫描 @Controller 注解，而不能扫描 @Service 、@Repository 等注解，否则会导致子容器中存在 Service 而不会去父容器中寻找，从而引发一些问题（如事务失效、AOP 增强失效等）。
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfiguration.class};
    }

    // 表现层的 Controller 及相关的组件都放到 Servlet 的子容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
