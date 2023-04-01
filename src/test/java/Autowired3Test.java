import autowired_demo2.config.Autowired2Config;
import autowired_demo2.entity.Boss;
import autowired_demo3.config.Autowired3Config;
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
 * @create 2023/4/1 - 下午 05:17
 * @since JDK 1.8
 */
public class Autowired3Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Autowired3Config.class);
        System.out.println(context);
        String[] beans = context.getBeanDefinitionNames();
        Arrays.stream(beans).forEach(System.out::println);
        context.close();
    }

}
