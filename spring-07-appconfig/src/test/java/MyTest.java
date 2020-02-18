import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ustc.wzh.config.appConfig;
import ustc.wzh.pojo.User;

public class MyTest {

    public static void main(String[] args) {

        //完全使用Java的方式配置Spring，我们只能通过AnnotationConfigApplicationContext来获得容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
        User user = (User) context.getBean("user");

        System.out.println(user.getName());
    }
}
