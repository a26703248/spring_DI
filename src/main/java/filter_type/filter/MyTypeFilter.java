package filter_type.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * ProjectName: spring_annotation_study
 * Package: filter_type.filter
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 01:21
 * @since JDK 1.8
 */
public class MyTypeFilter implements TypeFilter {
    /*
    MetadataReader 當前類別註解
    MetadataReaderFactory 當前以外類別註解
     */
    @Override
    public boolean match(MetadataReader metadataReader,
                         MetadataReaderFactory metadataReaderFactory)
            throws IOException {
        // 取得當前註解
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 取得當前物件
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 取得當前物件路徑
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("className: " + className);
        return className.contains("er");
    }
}
