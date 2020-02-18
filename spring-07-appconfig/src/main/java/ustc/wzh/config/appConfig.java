package ustc.wzh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ustc.wzh.pojo.User;


//@Configuration相当于配置的beans.xml文件，将其注册到容器给Spring托管，它本身就是一个@Component
@Configuration
@ComponentScan("ustc.wzh.pojo")
//@Import用于导入其他配置文件
@Import(appConfig2.class)
public class appConfig {

    //注册一个bean，相当于一个bean标签<bean id="user" class="ustc.wzh.pojo.User"></bean>
    //方法名为id属性值，返回类型为class属性值
    @Bean
    public User user() {
        return new User();
    }
}
