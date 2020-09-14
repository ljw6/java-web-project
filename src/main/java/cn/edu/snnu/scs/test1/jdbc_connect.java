package cn.edu.snnu.scs.test1;


import org.springframework.stereotype.Component;

@Component
public class jdbc_connect {
    String dbconnect(String uname,String upw){
        return "connect success";
    }
}
