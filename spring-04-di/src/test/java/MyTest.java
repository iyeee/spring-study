import com.kuang.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student)context.getBean("student");
        System.out.println(student.getAddress());

    }
    @Test
    public void Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student.getName());
    }
}