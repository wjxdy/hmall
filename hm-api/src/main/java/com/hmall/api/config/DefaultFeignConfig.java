package com.hmall.api.config;
import feign.Logger;
import org.springframework.context.annotation.Bean;

//局部配置
//@FeignClient(value = "item-service",configuration = DefaultFeignConfig.class)
public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }
}