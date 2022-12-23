package top.chengyunlai.webappInit;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import top.chengyunlai.config.EnableWebMvcConfiguration;
import top.chengyunlai.config.RootConfiguration;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class WebMvcApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {EnableWebMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
