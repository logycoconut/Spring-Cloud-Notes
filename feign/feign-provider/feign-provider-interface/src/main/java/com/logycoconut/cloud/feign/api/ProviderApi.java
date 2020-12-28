package com.logycoconut.cloud.feign.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hall
 * @date 2020/12/28
 */
@RequestMapping("user")
public interface ProviderApi {

    /**
     * 提供服务模拟
     * @return String
     */
    @GetMapping("info")
    String info();
}
