package com.extellon.etag.config;

import jakarta.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class AppConfig {
    
    @Bean
    public Filter eTagFilter() {
        return new ShallowEtagHeaderFilter();
    }
}