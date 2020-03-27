package com.test.work;

import cn.stylefeng.roses.kernel.logger.util.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * 系统管理
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class TestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
        LogUtil.info("Test Server Start SUCCESS！");
    }


}
