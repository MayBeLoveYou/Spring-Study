import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ustc.wzh.pojo.Hello;

public class MyTest {

    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Spring管理对象，直接取出来就可以使用
        Hello h = (Hello) context.getBean("hello");
        System.out.println(h.toString());
    }
}
