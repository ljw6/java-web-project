package cn.edu.snnu.scs.test1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pc")
public class pc_log implements Login_aproch {
    @Override
    public String Login(String name, String pw) {
        String s = "pc login successful";
        return s;
    }
}
