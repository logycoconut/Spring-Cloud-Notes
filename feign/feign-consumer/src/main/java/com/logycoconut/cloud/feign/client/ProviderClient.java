package com.logycoconut.cloud.feign.client;

import com.logycoconut.cloud.feign.api.ProviderApi;
import com.logycoconut.cloud.feign.fallback.ProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author hall
 * @date 2020/12/28
 */
@FeignClient(value = "feign-provider", fallback = ProviderClientFallback.class)
public interface ProviderClient extends ProviderApi {
}
