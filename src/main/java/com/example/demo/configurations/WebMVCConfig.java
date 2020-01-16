package com.example.demo.configurations;

import com.example.demo.handlers.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    @Autowired
    Handler handler;
 // Contains project configurations files. E.g Spring Config
    //configure handler
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handler);
    }
}
