import com.kuang.config.KuConfig;
import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {


    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(KuConfig.class);
        User getUser=(User)context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}