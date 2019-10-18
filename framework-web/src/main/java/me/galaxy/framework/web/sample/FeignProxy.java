package me.galaxy.framework.web.sample;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-17 13:59
 **/
@FeignClient(name = "feignProxy", url = "http://localhost:8080")
public interface FeignProxy {

    @RequestMapping(path = "/hello")
    String invokeHelloWorld();

}