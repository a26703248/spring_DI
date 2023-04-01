package import_anno.config;

import import_anno.entity.Color;
import import_anno.entity.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ProjectName: spring_annotation_study
 * Package: import_anno.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:32
 * @since JDK 1.8
 */
@Configuration
@Import({Color.class, Person.class}) // ID 默認為物件全路徑名稱
public class ImportAnnotationConfig {
    /*
        物件加入容器管理
        自己定義物件(@Controller、@Service)使用@ComponentScan
        引用第三方物件使用@Import
     */
}
