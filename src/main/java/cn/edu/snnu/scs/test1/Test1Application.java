package cn.edu.snnu.scs.test1;

//import com.sun.tools.sjavac.Log;
import cn.edu.snnu.scs.demo.User_Dao;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//import java.util.logging.Logger;

@SpringBootApplication
@ComponentScan("cn.edu.snnu.scs")
public class Test1Application {
    private static Logger log = LoggerFactory.getLogger(Test1Application.class);
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(Test1Application.class, args);
        User_Dao us_da = context.getBean(User_Dao.class);
        log.info(us_da.toString());
        log.info(us_da.getJdbc().toString());

    }
}