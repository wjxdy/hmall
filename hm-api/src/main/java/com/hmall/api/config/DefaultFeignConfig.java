package com.hmall.api.config;
import cn.hutool.http.server.HttpServerRequest;
import feign.Logger;
import feign.RequestInterceptor;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;
import java.util.Enumeration;

//局部配置
//@FeignClient(value = "item-service",configuration = DefaultFeignConfig.class)
public class DefaultFeignConfig {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }





    public RequestInterceptor userInfoRequestInterceptor(){

        return template -> {

            ServletRequestAttributes requestAttributes =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            HttpServletRequest request = requestAttributes.getRequest();

            //1、获取所有请求头的id
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()){
                String key = headerNames.nextElement().toString();
                String value = request.getHeader(key);

                // 一定注意，这里一定要移除，因为再次转发给其他服务，数据长度将不再是原来数据长度
                if("content-length".equals(key)){
                    continue;
                }

                //2、全部再封装到请求头
                template.header(key,value);


            }


        };

    }
}