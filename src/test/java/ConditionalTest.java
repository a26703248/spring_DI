import conditional.config.ConditionalConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 01:52
 * @since JDK 1.8
 */
public class ConditionalTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionalConfig.class);
        String[] beanNames = context.getBeanDefinitionNames();
        ConfigurableEnvironment env = context.getEnvironment();
        String os = env.getProperty("os.name");

        System.out.println(os);
        Arrays.stream(beanNames).forEach(System.out::println);
    }

}
