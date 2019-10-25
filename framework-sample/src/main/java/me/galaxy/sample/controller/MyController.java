package me.galaxy.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-10-24 19:56
 **/
@RestController
public class MyController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/exception")
    public String exception() {
        throw new RuntimeException("Test");
    }

}