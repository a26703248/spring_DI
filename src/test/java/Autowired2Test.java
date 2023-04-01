import autowired_demo.config.AutowiredConfig;
import autowired_demo.entity.BookDao;
import autowired_demo.service.BookService;
import autowired_demo2.config.Autowired2Config;
import autowired_demo2.entity.Boss;
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
public class Autowired2Test {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Autowired2Config.class);

//        String[] beans = context.getBeanDefinitionNames();
//        Arrays.stream(beans).forEach(System.out::println);
        Boss bean = context.getBean(Boss.class);
        System.out.println(bean);
        context.close();
    }

}
