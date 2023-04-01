package import_selector_ann.config;

import import_anno.entity.Color;
import import_anno.entity.Person;
import import_selector_ann.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ProjectName: spring_annotation_study
 * Package: import_selector_ann.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:43
 * @since JDK 1.8
 */
@Configuration
@Import({Color.class, Person.class, MyImportSelector.class})
public class ImportSelectorConfig {
}
