package me.galaxy.framework.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/my")
public class MyController {

    @Resource
    private MyConfiguration myConfiguration;

    @RequestMapping("/hello")
    public String hello() {
        return "hello " + myConfiguration.getName();
    }

}
