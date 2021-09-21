package com.zty.mapper;

import com.zty.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserDao{

    //在原来，我们所有操作使用SQLSession来执行，现在使用sqlSessionTemplate来创建，Spring来管理这个的创建
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        User user = new User(5,"小明","123456");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(user);
        mapper.deleteUser(4);
        return mapper.selectUser();
    }

    //新增
    public int addUser(User user) {
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.addUser(user);
    }
    //删除
    public int deleteUser(int id) {
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        return mapper.deleteUser(id);
    }


}
