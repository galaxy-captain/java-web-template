package me.galaxy.framework.gateway;

import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.RouteRefreshListener;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ClassUtils;

import java.util.function.Function;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-10-25 11:39
 **/
@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator myRouteLocator(ConfigurableApplicationContext context) {

        RouteLocatorBuilder builder = new RouteLocatorBuilder(context);

        return null;

    }

}