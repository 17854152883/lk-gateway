package cn.hacklike.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"cn.hacklike.app"})
@SpringBootApplication
@EnableDiscoveryClient
public class LkGateway {

    public static void main(String[] args) {
        SpringApplication.run(LkGateway.class,args);
    }


}
