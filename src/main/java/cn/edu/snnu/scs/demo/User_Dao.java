package cn.edu.snnu.scs.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//import java.util.logging.Logger;

@Component
public class User_Dao {
    private jdbc_connect jdbc;
    private static Logger log = LoggerFactory.getLogger(User_Dao.class);
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
    @PostConstruct
    public void postConstruct(){
        log.info("postConstruct");
    }

    @PreDestroy
    public void preDstroy() {
        log.info("preDstroy");
    }
}
