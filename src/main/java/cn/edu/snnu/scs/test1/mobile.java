package cn.edu.snnu.scs.test1;

import org.springframework.stereotype.Component;

@Component
public class mobile implements Login_aproch  {
    @Override
    public String Login(String name, String pw) {
        String s = "phone log in success";
        return s;
    }
}
