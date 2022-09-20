package com.bj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableDiscoveryClient
@SpringBootApplication
public class Gateway01Application {

    public static void main(String[] args) {

        ApplicationContext run = SpringApplication.run(Gateway01Application.class, args);

        System.out.println(111);

    }

}
