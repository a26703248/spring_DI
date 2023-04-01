
import filter_type.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 12:46
 * @since JDK 1.8
 */
public class TypeFilterTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext application =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        String[] beanNames = application.getBeanDefinitionNames();
        Arrays.stream(beanNames)
                .forEach(System.out::println);
    }

}
