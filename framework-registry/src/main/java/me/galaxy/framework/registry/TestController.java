package me.galaxy.framework.registry;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-11-11 20:31
 **/
@RestController
public class TestController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }

    @RequestMapping("/description")
    public String description() {
        return discoveryClient.description();
    }

    @RequestMapping("/getInstances")
    public List<ServiceInstance> getInstances(String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }

    @RequestMapping("/getServices")
    public List<String> getServices() {
        return discoveryClient.getServices();
    }

}