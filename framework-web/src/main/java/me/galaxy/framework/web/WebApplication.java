package me.galaxy.framework.web;

import me.galaxy.framework.http.FeignHttpConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-10-15 22:07
 **/
@EnableConfigurationProperties
@EnableFeignClients(basePackages = "me.galaxy.framework.web", defaultConfiguration = {FeignHttpConverter.class})
@SpringBootApplication(scanBasePackages = "me.galaxy.framework")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}