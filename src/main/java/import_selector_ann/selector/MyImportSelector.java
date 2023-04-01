package import_selector_ann.selector;

import import_selector_ann.entity.Car;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ProjectName: spring_annotation_study
 * Package: import_selector_ann.selector
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:44
 * @since JDK 1.8
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // AnnotationMetadata 當前備標註 @Import 註解的物件所有註解
        String className = importingClassMetadata.getClassName();
        System.out.println("className: " + className);
        // 不可返回 null 值
        return new String[]{Car.class.getName()};
    }
}
