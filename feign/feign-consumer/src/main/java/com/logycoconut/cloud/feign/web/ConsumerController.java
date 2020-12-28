package com.logycoconut.cloud.feign.web;

import com.logycoconut.cloud.feign.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hall
 * @date 2020-12-23 23:32
 */
@RestController
@RequestMapping("user")
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("consume")
    public String consume() {
        return providerClient.info();
    }

}
