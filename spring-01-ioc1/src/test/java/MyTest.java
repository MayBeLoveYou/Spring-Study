import ustc.wzh.dao.UserDaoMySqlImpl;
import ustc.wzh.dao.UserDaoOracleImpl;
import ustc.wzh.service.UserService;
import ustc.wzh.service.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserDaoMySqlImpl() );
        userService.getUser();

        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl() );
        userService.getUser();

    }
}
