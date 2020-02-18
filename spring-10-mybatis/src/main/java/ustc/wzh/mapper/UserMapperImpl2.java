package ustc.wzh.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import ustc.wzh.pojo.User;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}