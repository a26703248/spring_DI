import jsr_resource.config.JsrResourcesConfig;
import jsr_resource.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 06:10
 * @since JDK 1.8
 */
public class JsrResourceTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JsrResourcesConfig.class);
        EmployeeService bean = context.getBean(EmployeeService.class);
        bean.print();
    }
}
