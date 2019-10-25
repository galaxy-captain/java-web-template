package me.galaxy.framework.http;

import me.galaxy.framework.http.feign.FeignHttpConverter;
import me.galaxy.framework.http.rest.RestHttpConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-23 20:40
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({HttpProperties.class,
        HttpClientConfiguration.class,
        FeignHttpConverter.class,
        RestHttpConfiguration.class})
public @interface EnableHttpFramework {

}