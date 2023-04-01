import import_anno.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import properties_value.Dog;
import properties_value.PropertiesValueConfig;

import java.util.Arrays;

/**
 * ProjectName: spring_annotation_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 04:58
 * @since JDK 1.8
 */
public class PropertiesValueTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PropertiesValueConfig.class);
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
        ConfigurableEnvironment env = context.getEnvironment();
        String property = env.getProperty("wolf.action");
        System.out.println(property);
    }

}
