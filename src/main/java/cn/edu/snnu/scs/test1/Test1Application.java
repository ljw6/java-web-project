package cn.edu.snnu.scs.test1;

//import com.sun.tools.sjavac.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Test1Application.class, args);
        User_Dao us_da = context.getBean(User_Dao.class);
        System.out.println(us_da);
        System.out.println(us_da.getJdbc());
        User_Dao us_da2 = context.getBean(User_Dao.class);
        System.out.println(us_da2);
        System.out.println(us_da2.getJdbc());
    }

}
