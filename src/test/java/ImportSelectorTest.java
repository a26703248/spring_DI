import import_selector_ann.config.ImportSelectorConfig;
import import_selector_ann.entity.Car;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 02:45
 * @since JDK 1.8
 */
public class ImportSelectorTest {

    @Test
    public void test01(){
        String[] beanNames = GetContext.getBeanNames(ImportSelectorConfig.class);
        Arrays.stream(beanNames).forEach(System.out::println);
    }

}
