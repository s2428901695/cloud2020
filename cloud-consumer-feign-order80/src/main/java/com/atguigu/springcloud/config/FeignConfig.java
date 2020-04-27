package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author SXD
 * @create 2020/4/22 11:04
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }

}
