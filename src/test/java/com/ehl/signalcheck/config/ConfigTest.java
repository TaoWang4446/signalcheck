package com.ehl.signalcheck.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = Config.class)
public class ConfigTest {

    @Autowired
    private Config config;

    @Test
    public void readCofig() {
        System.out.println(config.getServerip());
        System.out.println(config.getOracleip());
        System.out.println(config.getDpassword());
    }
}