package me.galaxy.framework.web.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-17 13:59
 **/
@FeignClient(name = "feignProxy", url = "${server.port}")
public interface FeignProxy {

    @RequestMapping(path = "/hello")
    String invokeHelloWorld();

}