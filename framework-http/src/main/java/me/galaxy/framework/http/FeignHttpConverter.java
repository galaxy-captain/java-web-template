package me.galaxy.framework.http;

import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;

/**
 * @Description Feign解析器配置
 * @Author galaxy-captain
 * @Date 2019-10-15 22:36
 **/
public class FeignHttpConverter {

    @Bean
    public Decoder feignDecoder(HttpMessageConverters converters) {
        return new ResponseEntityDecoder(new SpringDecoder(() -> converters));
    }

    @Bean
    public Encoder feignEncoder(HttpMessageConverters converters) {
        return new SpringEncoder(() -> converters);
    }

}