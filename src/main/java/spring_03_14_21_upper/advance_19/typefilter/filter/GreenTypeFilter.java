package spring_03_14_21_upper.advance_19.typefilter.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import spring_03_14_21_upper.advance_19.typefilter.color.Green;

import java.io.IOException;

/**
 * @ClassName
 * @Description 实现TypeFilter完成自定义过滤策略，放在ComponentScan
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
public class GreenTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // MetadataReader 中有一个 getClassMetadata 方法，可以拿到正在扫描的类的基本信息，咱可以由此取到全限定类名，进而与咱需求中的 Green 类做匹配
        // 先获取到所有扫描类的信息，如果通过getClassName().equals(Green.class.getName());匹配上Green类，则表示匹配成功
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 返回 true ，则说明已经匹配上了。
        return classMetadata.getClassName().equals(Green.class.getName());
    }
}
