package com.example.eduschoolprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EduSchoolProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduSchoolProviderApplication.class, args);
    }

}
