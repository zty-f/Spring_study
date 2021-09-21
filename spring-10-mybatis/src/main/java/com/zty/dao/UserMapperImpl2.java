package com.zty.dao;

import com.zty.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserDao {
    public List<User> selectUser() {
        SqlSession sqlSession=getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.selectUser();
    }
}