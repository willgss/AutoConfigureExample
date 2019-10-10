package com.gss.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloWorldUtil.class)
public class MyConfiguration {
    @Autowired
    private HelloProperties helloProperties;

    @Bean
    @ConditionalOnMissingBean(HelloWorldUtil.class)
    public HelloWorldUtil helloWorldUtil() {
        HelloWorldUtil helloWorldUtil = new HelloWorldUtil();
        helloWorldUtil.setMsg(helloProperties.getMsg());
        return helloWorldUtil;
    }
}