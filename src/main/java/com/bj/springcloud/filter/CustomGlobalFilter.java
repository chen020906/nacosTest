package com.bj.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 自定义全局Filter
 */
@Slf4j
@Component
public class CustomGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //log.info("全局Filter请求......");
        System.out.println("全局filter 执行了、、、、、、、、、、、");
        MultiValueMap<String, String> valueMap = exchange.getRequest().getQueryParams();
        valueMap.forEach((k, v) -> {
            //log.info("全局Filter拦截参数 {} ", k);
            v.forEach(s -> {
                //log.info("全局Filter拦截参数值 = {} ", s);
            });
        });
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}