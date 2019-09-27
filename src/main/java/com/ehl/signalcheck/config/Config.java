package com.ehl.signalcheck.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@ConfigurationProperties(prefix = "calculateserver")
@Component
public class Config {

    private Config(){}

    @Value("${calculateserver.serverip}")
    private String serverip;

    @Value("${calculateserver.serverport}")
    private String serverport;

    @Value("${calculateserver.clientip}")
    private String clientip;

    @Value("${calculateserver.clientport}")
    private String clientport;


    @Value("${oracle.oracleip}")
    private String oracleip;
    @Value("${oracle.oracleport}")
    private String oracleport;
    @Value("${oracle.oraclebasename}")
    private String oraclebasename;
    @Value("${oracle.username}")
    private String username;
    @Value("${oracle.password}")
    private String password;


    @Value("${thread.delaytime}")
    private String delaytime;
    @Value("${thread.period}")
    private String period;
    @Value("${thread.quantity}")
    private String quantity;
    @Value("${thread.mode}")
    private String mode;


    @Value("${trafficpnum.num}")
    private String num;


    @Value("${trafficpoint1.devnum}")
    private String devnum;
    @Value("${trafficpoint1.tpid}")
    private String tpid;


    @Value("${dev1-1.factype}")
    private String factype;
    @Value("${dev1-1.devid}")
    private String devid;
    @Value("${dev1-1.devtype}")
    private String devtype;
    @Value("${dev1-1.devip}")
    private String devip;
    @Value("${dev1-1.devport}")
    private String devport;
    @Value("${dev1-1.dusername}")
    private String dusername;
    @Value("${dev1-1.dpassword}")
    private String dpassword;

}