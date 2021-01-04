package com.logycoconut.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hall
 * @date 2021/1/4
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

    @Value("${user.username}")
    private String username;

    @GetMapping("/")
    public String home() {
        return username;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
