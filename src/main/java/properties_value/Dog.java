package properties_value;

import org.springframework.beans.factory.annotation.Value;

/**
 * ProjectName: spring_annotation_study
 * Package: properties_value
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 05:03
 * @since JDK 1.8
 */
public class Dog {

    /*
    使用  @Value 賦值
    1. 基本數值
    2. SpEL #{}
    3. ${} 取得設定檔值
     */
    @Value("小白")
    private String name;

    @Value("#{'紅色'}")
    private String color;

    @Value("${wolf.action}")
    private String wolf;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWolf() {
        return wolf;
    }

    public void setWolf(String wolf) {
        this.wolf = wolf;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wolf='" + wolf + '\'' +
                '}';
    }
}
