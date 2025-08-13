package com.hmall.gateway.filter;

import cn.hutool.core.text.AntPathMatcher;
import cn.hutool.core.util.ObjUtil;
import com.hmall.gateway.config.AuthProperties;
import com.hmall.gateway.config.JwtProperties;
import com.hmall.gateway.utils.JwtTool;
import org.springframework.beans.StandardBeanInfoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

@EnableConfigurationProperties({JwtProperties.class,AuthProperties.class})
@Component
public class AuthGlobalFilter implements GlobalFilter {

    @Autowired
    private AuthProperties authProperties;
    @Autowired
    private JwtTool jwtTool;
    private AntPathMatcher antPathMatcher=new AntPathMatcher();


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

        String uri = request.getPath().toString();
        if (isExclude(uri)){

            chain.filter(exchange);
        }


        String token = request.getHeaders().getFirst("authorization");

        Long userId = null;

        try {
            userId = jwtTool.parseToken(token);
        } catch (Exception e) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
            return response.writeWith(Mono.just(response.bufferFactory().wrap("请先登录".getBytes(StandardCharsets.UTF_8))));
        }

        String userInfo = userId.toString();
        exchange.mutate().request(builder -> builder.header("user-info",userInfo));

        return chain.filter(exchange);
    }
    public boolean isExclude(String uri){

        return authProperties.getExcludePaths()
                .stream().anyMatch(ep->antPathMatcher.match(ep,uri));

    }



}
