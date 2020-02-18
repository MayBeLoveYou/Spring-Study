package ustc.wzh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class User {

    private String userName;
    private static User user;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private User(String userName) {

        // 2.这句话用于防止通过反射的方式调用该构造器创建对象
        if (user != null) {
            throw new RuntimeException("非法创建对象！");
        }
        this.userName = userName;
    }

    public static User getInstance(String userName) {
        if (user == null) {
            user = new User(userName);
        }
        return user;
    }
}

class MyTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.通过反射破解单例模式
        User user = User.getInstance("王");
        System.out.println(user.getUserName());

        Class c1 = Class.forName("ustc.wzh.User");
        Constructor<User> constructor = User.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        User user1 = constructor.newInstance("张");

        System.out.println(user1.getUserName());
        System.out.println(user.getUserName());
    }
}
