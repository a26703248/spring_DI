package profile.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.*;
import org.springframework.util.StringValueResolver;
import profile.entity.Bike;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * ProjectName: spring_annotation_study
 * Package: profile.config
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/1 - 下午 07:24
 * @since JDK 1.8
 */
/*
   @Profile 指定在哪個環境下被執行
   1. 預設為default環境
   2. 若是@Profile寫在類別上則在該環境才生效
*/
@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan("profile")
@Profile("test") // 測試環境下生效
public class ProfileConfig implements EmbeddedValueResolverAware {

    @Value("${database.username}")
    private String username;

    private String driverClass;

    private StringValueResolver resolver;


    @Bean
    @Profile("default") // 預設環境
    public Bike bike(){
        return new Bike();
    }

    @Bean("product")
    @Profile("prod")
    public DataSource product(@Value("${database.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl(resolver.resolveStringValue("${database.product.jdbcUrl}"));
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean("dev")
    @Profile("dev")
    public DataSource development(@Value("${database.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl(resolver.resolveStringValue("${database.dev.jdbcUrl}"));
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Bean("test")
    @Profile("test")
    public DataSource testEnv(@Value("${database.password}") String pwd) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl(resolver.resolveStringValue("${database.test.jdbcUrl}"));
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.resolver = resolver;
        this.driverClass = resolver.resolveStringValue("${database.driverClass}");
    }
}
