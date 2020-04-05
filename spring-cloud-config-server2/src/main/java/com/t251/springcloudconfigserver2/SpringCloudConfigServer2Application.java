package com.t251.springcloudconfigserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SpringCloudConfigServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer2Application.class, args);
    }

}
