package com.hmall.item.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NacosConfigChecker implements CommandLineRunner {
    // 读取 Nacos 服务器地址（默认值为 "未读取到"）
    @Value("${spring.cloud.nacos.discovery.server-addr:未读取到}")
    private String nacosServerAddr;

    @Value("${spring.application.name:未读取到}")
    private String serviceName;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== 配置检查 ===");
        System.out.println("服务名：" + serviceName);
        System.out.println("Nacos 地址：" + nacosServerAddr);
    }
}