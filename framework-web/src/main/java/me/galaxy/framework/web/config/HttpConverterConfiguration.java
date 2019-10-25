package me.galaxy.framework.web.config;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-17 22:13
 **/
@Configuration
public class HttpConverterConfiguration implements WebMvcConfigurer {

    @Bean
    public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {

        FastJsonConfig config = new FastJsonConfig();
        config.setCharset(StandardCharsets.UTF_8);

        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);

        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.setFastJsonConfig(config);
        converter.setSupportedMediaTypes(fastMediaTypes);

        return converter;
    }

}