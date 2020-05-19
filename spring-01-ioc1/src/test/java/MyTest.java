import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello= (Hello) context.getBean("helloNewer");
        System.out.println(hello.toString());
        System.out.println(hello.getStr());

    }
}
