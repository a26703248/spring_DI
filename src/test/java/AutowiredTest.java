import autowired_demo.config.AutowiredConfig;
import autowired_demo.entity.BookDao;
import autowired_demo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
public class AutowiredTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AutowiredConfig.class);
        BookService bean = context.getBean(BookService.class);
        System.out.println(bean);
        BookDao bean1 = (BookDao) context.getBean("bookDao2");
        System.out.println(bean1);
        context.close();
    }

}
