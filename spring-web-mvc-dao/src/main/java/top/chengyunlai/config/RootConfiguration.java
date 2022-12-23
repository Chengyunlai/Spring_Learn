package top.chengyunlai.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
@Import(JdbcDaoConfiguration.class)

@ComponentScan(value = "top.chengyunlai",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
        })
public class RootConfiguration {
        @Bean("multipartResolver")
        public CommonsMultipartResolver getCommonsMultipartResolver() {
                CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
                commonsMultipartResolver.setMaxUploadSize(2097152);
                return commonsMultipartResolver;
        }
}
