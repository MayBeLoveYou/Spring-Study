package ustc.wzh.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import ustc.wzh.pojo.User;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {


    public List<User> selectUser() {
        User user = new User(7,"小明","123456");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(6);
        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
