package bean_left_cycle.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_left_cycle.entity
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:47
 * @since JDK 1.8
 */
public class Bird implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Bird() {
        System.out.println("bird constructor ...");
    }

    // JSR250
    @PostConstruct
    public void init(){
        System.out.println("JSR250 bird init ...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250 bird destroy ...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
