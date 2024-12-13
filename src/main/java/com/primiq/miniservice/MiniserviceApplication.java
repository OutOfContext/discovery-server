package com.primiq.miniservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniserviceApplication.class, args);
    }

}
