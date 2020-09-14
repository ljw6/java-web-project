package cn.edu.snnu.scs.test1;

//import com.sun.tools.sjavac.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Test1Application.class, args);
        loggin_bs loggin_bss = context.getBean(loggin_bs.class);
        String s = loggin_bss.Loggin_pro("name", "mima");
        System.out.println(s);
    }

}
