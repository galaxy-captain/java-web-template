package me.galaxy.framework.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-10-24 15:25
 **/
@EnableFeignClients(basePackages = "me.galaxy.framework.web")
@SpringBootApplication(scanBasePackages = "me.galaxy.framework.web")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}