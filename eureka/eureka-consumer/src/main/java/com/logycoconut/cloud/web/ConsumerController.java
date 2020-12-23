package com.logycoconut.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hall
 * @date 2020-12-23 23:32
 */
@RestController
@RequestMapping("user")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String APPLICATION_NAME = "eureka-provider";

    @GetMapping("consume")
    public String consume() {
        String providerUrl = "http://" + APPLICATION_NAME + "/user/info";
        return this.restTemplate.getForObject(providerUrl, String.class);
    }

}
