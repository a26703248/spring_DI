package autowired_demo.config;

import autowired_demo.entity.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * ProjectName: spring_annotation_study
 * Package: autowired_demo.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 05:15
 * @since JDK 1.8
 */
@Configuration
@ComponentScan({"autowired_demo"})
public class AutowiredConfig {


    @Bean("bookDao2")
    @Primary // 自動裝配時第一選擇的，但 @Qualifier 則為指定的容器內物件
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

}
