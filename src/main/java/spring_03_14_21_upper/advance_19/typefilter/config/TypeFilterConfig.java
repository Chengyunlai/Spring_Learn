package spring_03_14_21_upper.advance_19.typefilter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring_03_14_21_upper.advance_19.typefilter.anno.Animal;
import spring_03_14_21_upper.advance_19.typefilter.color.Color;
import spring_03_14_21_upper.advance_19.typefilter.filter.GreenTypeFilter;

/**
 * @ClassName
 * @Description扫描整个 f_typefilter 包，之后在 @ComponentScan 注解中声明 includeFilters 属性，让它把含有 @Animal 注解的类带进来：
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Configuration
// includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class) 意思是，将Animal标注的类放到容器中
// excludeFilters 将对应条件的bean从容器中排除出去
@ComponentScan(value = "spring_03_14_21_upper.advance_19.typefilter",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class),@ComponentScan.Filter(type = FilterType.REGEX, pattern = "spring_03_14_21_upper.advance_19.typefilter.DataSource.+Demo.+")},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,value = GreenTypeFilter.class)}
)
public class TypeFilterConfig {
}
