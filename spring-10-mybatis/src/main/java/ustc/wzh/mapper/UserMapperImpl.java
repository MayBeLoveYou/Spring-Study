package ustc.wzh.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import ustc.wzh.pojo.User;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSession;

    //用于注入sqlSession
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
