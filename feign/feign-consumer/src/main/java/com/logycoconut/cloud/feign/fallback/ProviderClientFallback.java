package com.logycoconut.cloud.feign.fallback;

import com.logycoconut.cloud.feign.client.ProviderClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author hall
 * @date 2020/12/28
 */
@Service
public class ProviderClientFallback implements ProviderClient {
    @Override
    public String info() {
        return "调用失败";
    }
}
