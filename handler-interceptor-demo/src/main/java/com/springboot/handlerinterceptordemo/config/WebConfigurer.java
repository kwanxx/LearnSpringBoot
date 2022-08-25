package com.springboot.handlerinterceptordemo.config;

import com.springboot.handlerinterceptordemo.handler.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    private TestInterceptor testInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(testInterceptor).addPathPatterns("/**");
    }
}
