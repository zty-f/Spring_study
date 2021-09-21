package com.zty.dao;

import com.zty.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import java.util.List;

public class UserMapperImpl implements UserDao{

    //在原来，我们所有操作使用SQLSession来执行，现在使用sqlSessionTemplate来创建，Spring来管理这个的创建
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.selectUser();
    }

}
