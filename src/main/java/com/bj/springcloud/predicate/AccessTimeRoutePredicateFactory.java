package com.bj.springcloud.predicate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 自定义路由谓词
 *
 * @author 小Q
 */
@Component
public class AccessTimeRoutePredicateFactory extends AbstractRoutePredicateFactory<AccessTimeConfig> {

    public AccessTimeRoutePredicateFactory() {
        super(AccessTimeConfig.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(AccessTimeConfig config) {
        LocalTime start = config.getStart();
        LocalTime end = config.getEnd();

        return (serverWebExchange) -> {

            LocalTime now = LocalTime.now();

            //return now.isAfter(start) && now.isBefore(end);
            return true;
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("start", "end");
    }
}