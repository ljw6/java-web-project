package cn.edu.snnu.scs.test1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mob")
public class mobile implements Login_aproch  {
    @Override
    public String Login(String name, String pw) {
        return "phone log in success";
    }
}
