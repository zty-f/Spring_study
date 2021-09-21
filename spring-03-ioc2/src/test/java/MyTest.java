import com.zty.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //Spring容器，就类似于婚介网站，都已经实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user =(User)context.getBean("user");
        user.show();
    }


}
