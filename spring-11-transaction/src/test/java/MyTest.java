import com.zty.mapper.UserDao;
import com.zty.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void testSelectUser() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao mapper = (UserDao) context.getBean("userDao");
        List<User> user = mapper.selectUser();
        System.out.println(user);
    }
}
