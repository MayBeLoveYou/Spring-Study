package ustc.wzh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component相当于<bean id="user" class="ustc.wzh.pojo.User"></bean>
@Component
@Scope("prototype")
public class User {

    public String name;

    //@Value("小王")相当于<property name="name" value="小王"/>
    @Value("小王")
    public void setName(String name) {
        this.name = name;
    }
}
