package com.test.work.modular.consumer;

import com.wulin.happy.system.api.AuthApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 鉴权服务的消费者
 *
 */
@FeignClient("wulin-system")
public interface AuthServiceConsumer extends AuthApi {

}
