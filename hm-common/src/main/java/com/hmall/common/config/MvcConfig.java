package com.hmall.common.config;

import com.hmall.common.interceptor.UserInfoInterceptor;
import com.hmall.common.utils.CollUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.Authenticator;
import java.util.List;

@RequiredArgsConstructor
@Configuration
@EnableConfigurationProperties(AuthProperties.class)
public class MvcConfig implements WebMvcConfigurer {

    private final AuthProperties authProperties;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new UserInfoInterceptor());

        List<String> includePaths = authProperties.getIncludePaths();

        if (CollUtils.isNotEmpty(includePaths)){

            registration.addPathPatterns(includePaths);
        }

        List<String> excludePaths = authProperties.getExcludePaths();
        if (CollUtils.isEmpty(excludePaths)){

            registration.excludePathPatterns(excludePaths);

        }
        registration.excludePathPatterns(
                "/error",

                "/favicon.ico",

                "/V2/**",

                "/V3/**",

                "/swagger-resources/**",
                "/webjars/**",
                "doc.html"


                );


    }
}
