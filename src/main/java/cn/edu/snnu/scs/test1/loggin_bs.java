package cn.edu.snnu.scs.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class loggin_bs {
    @Qualifier(value = "pc")
    @Autowired
    Login_aproch log_ap;
    public void setLog_ap(Login_aproch log_ap) {
        this.log_ap = log_ap;
    }

    public Login_aproch getLog_ap() {
        return log_ap;
    }

    //public loggin_bs(Login_aproch log_ap){ this.log_ap = log_ap;}
    public String Loggin_pro(String name,String pw){
        String ress = getLog_ap().Login(name,pw);
        return ress;
    }
}
