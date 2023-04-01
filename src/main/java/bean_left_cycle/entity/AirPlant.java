package bean_left_cycle.entity;

/**
 * ProjectName: spring_annotation_study
 * Package: bean_left_cycle.entity
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:32
 * @since JDK 1.8
 */
public class AirPlant {
    public AirPlant() {
        System.out.println("constructor ...");
    }

    public void init(){
        System.out.println("init ...");
    }

    public void destroy(){
        System.out.println("destroy ...");
    }

}
