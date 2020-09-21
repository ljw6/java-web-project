package cn.edu.snnu.scs.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class jdbc_connect {
    public jdbc_connect(){
        System.out.println("jdbc 构造函数");
    }
    //String dbconnect(String uname,String upw){
      //  return "connect success";
    //}

    public String jdbc_process(){
        System.out.println("jdbc 开始工作");
        return "process done";
    }

}
