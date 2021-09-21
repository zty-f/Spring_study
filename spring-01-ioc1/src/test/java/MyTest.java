import com.zty.dao.UserDaoMysqlImpl;
import com.zty.dao.UserDaoOracleImpl;
import com.zty.dao.UserDaoSqlserverImpl;
import com.zty.service.UserService;
import com.zty.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
//    public static void main(String[] args) {
//        //用户实际调用的业务层，Dao层他们不需要接触！
//        UserServiceImpl userService = new UserServiceImpl(new UserDaoSqlserverImpl());
//        userService.getUser();
//    }
//    IOC方式
public static void main(String[] args) {
    //获取ApplicationContext,拿到spring的容器
ApplicationContext Context = new ClassPathXmlApplicationContext("beans.xml");
    //获得了容器，需要什么就get什么！
    UserServiceImpl userServiceImpl = (UserServiceImpl) Context.getBean("UserServiceImpl");
    userServiceImpl.getUser();
}

}
