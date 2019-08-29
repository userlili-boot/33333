package org.free.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("org.free.manage.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ManageStarter {

    public static void main(String[] args) {
        System.out.println("---------------spring boot start------------------------");
        SpringApplication.run(ManageStarter.class, args);
        System.out.println("---------------spring boot end------------------------");
    }
    
    

}
