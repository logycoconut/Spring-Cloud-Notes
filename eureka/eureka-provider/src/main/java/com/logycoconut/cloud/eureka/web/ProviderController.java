package com.logycoconut.cloud.eureka.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hall
 * @date 2020/12/22
 */
@Slf4j
@RestController
@RequestMapping("user")
public class ProviderController {

    @GetMapping("info")
    public String info() {
        log.info("接收到请求");
        return "我叫张三，今年二十三";
    }
}