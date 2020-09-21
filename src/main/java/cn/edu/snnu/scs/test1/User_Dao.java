package cn.edu.snnu.scs.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User_Dao {
    private jdbc_connect jdbc;

    @Autowired
    public User_Dao(jdbc_connect jdbc){
        this.jdbc = jdbc;
    }

    public jdbc_connect getJdbc() {
        return jdbc;
    }

    public void setJdbc(jdbc_connect jdbc) {
        this.jdbc = jdbc;
    }
}
