package factory_bean.factory;

import import_anno.entity.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * ProjectName: spring_annotation_study
 * Package: factory_bean.factory
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 03:13
 * @since JDK 1.8
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    // 物件實體
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean ...");
        return new Color();
    }

    // 物件型態
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // 控制是否單例
    @Override
    public boolean isSingleton() {
        return true; // true 為單例
    }
}
