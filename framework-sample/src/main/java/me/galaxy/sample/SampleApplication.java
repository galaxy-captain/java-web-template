package me.galaxy.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author duanxiaolei@bytedance.com
 * @Date 2019-10-24 19:55
 **/
@SpringBootApplication(scanBasePackages = "me.galaxy.sample")
public class SampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}