package me.galaxy.framework.web.sample;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-16 20:18
 **/
@Slf4j
@RestController
public class HelloController {

    @Resource
    private FeignProxy feignProxy;

    @GetMapping("/hello")
    public String world() {

        log.info("test MDC");

        return "hello world";
    }

    @GetMapping("/test/feign")
    public String testFeign() {

        log.info("test MDC");

        return feignProxy.invokeHelloWorld();
    }

}