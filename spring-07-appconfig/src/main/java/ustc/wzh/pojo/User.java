package ustc.wzh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//bean注入<bean id="user" class="ustc.wzh.pojo.User"></bean>
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    //属性值注入<property name="name" value="小王"/>
    @Value("小王")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
