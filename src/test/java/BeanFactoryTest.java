import factory_bean.config.BeanFactoryConfig;
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
 * @create 2023/4/1 - 下午 03:17
 * @since JDK 1.8
 */
public class BeanFactoryTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanFactoryConfig.class);
        Object color = context.getBean("colorFactoryBean");
        Object color2 = context.getBean("colorFactoryBean");
        System.out.println(color.getClass());
        System.out.println(color == color2);
        Object color3 = context.getBean("&colorFactoryBean");
        System.out.println(color3.getClass());
    }

}
