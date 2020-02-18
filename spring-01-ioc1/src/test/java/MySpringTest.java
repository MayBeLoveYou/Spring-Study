import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ustc.wzh.service.UserServiceImpl;

public class MySpringTest {

    public static void main(String[] args) {

        //获取容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //获取对象
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        //使用对象
        userServiceImpl.getUser();

    }
}
