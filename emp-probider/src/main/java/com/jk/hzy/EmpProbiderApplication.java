package com.jk.hzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmpProbiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpProbiderApplication.class, args);
    }

}
