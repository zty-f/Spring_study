import com.zty.dao.UserDao;
import com.zty.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void testSelectUser() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserDao mapper = (UserDao) context.getBean("userDao2");
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
