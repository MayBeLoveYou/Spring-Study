import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ustc.wzh.mapper.UserMapper;
import ustc.wzh.pojo.User;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }

}
