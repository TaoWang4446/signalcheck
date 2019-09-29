package com.ehl.signalcheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SignalcheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(SignalcheckApplication.class, args);
        System.out.println("springboot启动了!");
    }
}
