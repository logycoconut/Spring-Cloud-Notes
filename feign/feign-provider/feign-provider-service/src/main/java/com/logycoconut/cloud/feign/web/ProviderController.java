package com.logycoconut.cloud.feign.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hall
 * @date 2020/12/28
 */
@RestController
@RequestMapping("user")
public class ProviderController {

    @GetMapping("info")
    public String info() {
        return "我叫张三，今年二十三";
    }
}
