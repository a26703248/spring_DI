import bean_left_cycle.config.BeanLeftCycleConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:34
 * @since JDK 1.8
 */
public class BeanLeftCycleTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanLeftCycleConfig.class);
        System.out.println("IoC start ...");
        System.out.println("========================================");
        context.close();
        System.out.println("IoC close ...");

    }
}
