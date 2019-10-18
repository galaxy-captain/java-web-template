package me.galaxy.framework.http;

import feign.Feign;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author galaxy-captain
 * @Date 2019-10-16 20:52
 **/
@Configuration
@ConditionalOnClass(Feign.class)
@AutoConfigureBefore(FeignAutoConfiguration.class)
@ConfigurationProperties(prefix = "feign.http")
public class FeignHttpConfiguration {

    private Long connectTimeout = 30_000L;

    private Long readTimeout = 30_000L;

    private Long writeTimeout = 30_000L;

    private Integer maxIdle = 5;

    private Long maxAlive = 300_000L;

    public Long getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Long connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Long getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Long readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Long getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(Long writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public Integer getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(Integer maxIdle) {
        this.maxIdle = maxIdle;
    }

    public Long getMaxAlive() {
        return maxAlive;
    }

    public void setMaxAlive(Long maxAlive) {
        this.maxAlive = maxAlive;
    }

    @Bean
    public okhttp3.OkHttpClient okHttpClient() {

        ConnectionPool pool = new ConnectionPool(maxIdle, maxAlive, TimeUnit.MILLISECONDS);

        OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();

        builder.connectTimeout(connectTimeout, TimeUnit.MILLISECONDS);
        builder.readTimeout(readTimeout, TimeUnit.MILLISECONDS);
        builder.writeTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        builder.connectionPool(pool);

        return builder.build();
    }

}