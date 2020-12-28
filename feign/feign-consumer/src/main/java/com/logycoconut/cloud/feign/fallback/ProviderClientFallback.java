package com.logycoconut.cloud.feign.fallback;

import com.logycoconut.cloud.feign.client.ProviderClient;
import org.springframework.stereotype.Component;

/**
 * @author hall
 * @date 2020/12/28
 */
@Component
public class ProviderClientFallback implements ProviderClient {
    @Override
    public String info() {
        return "调用失败";
    }
}
