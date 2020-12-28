package com.logycoconut.cloud.feign.client;

import com.logycoconut.cloud.feign.api.ProviderApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author hall
 * @date 2020/12/28
 */
@FeignClient(value = "feign-provider")
public interface ProviderClient extends ProviderApi {
}
