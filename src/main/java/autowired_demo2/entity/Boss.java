package autowired_demo2.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ProjectName: spring_annotation_study
 * Package: autowired_demo.entity
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 06:31
 * @since JDK 1.8
 */
@Component
public class Boss {

    private Car car;


    // 若是物件只有一個有參數建構子則可不須加上@Autowired
    public Boss(Car car) {
        this.car = car;
    }
    // 及會自動裝配
//    @Autowired // 可選擇方參數或是建構子上
//    public Boss(@Autowired Car car) {
//        this.car = car;
//    }

    public Car getCar() {
        return car;
    }

    // Autowired 標住在方法上則會注入set方法賦值
    // 會透過傳入參數名稱在容器中尋找
//    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
