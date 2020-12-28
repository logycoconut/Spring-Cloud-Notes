package com.logycoconut.cloud.feign.api;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hall
 * @date 2020/12/28
 */
public interface ProviderApi {

    /**
     * 提供服务模拟
     * @return String
     */
    @GetMapping("info")
    String info();
}
