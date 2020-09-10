package cn.edu.snnu.scs.test1;

//import com.sun.tools.sjavac.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Test1Application.class, args);
        Login_aproch login = context.getBean(Login_aproch.class);
        String s = login.Login("name", "mima");
        System.out.println(s);
    }

}
