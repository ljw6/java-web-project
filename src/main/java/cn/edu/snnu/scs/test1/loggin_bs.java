package cn.edu.snnu.scs.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class loggin_bs {
    Login_aproch log_ap;
    @Autowired
    public loggin_bs(Login_aproch log_ap){ this.log_ap = log_ap;}
    public String Loggin_pro(String name,String pw){
        String ress = log_ap.Login(name,pw);
        return ress;
    }
}
