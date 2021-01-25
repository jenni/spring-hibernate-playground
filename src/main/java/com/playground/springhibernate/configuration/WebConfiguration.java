package com.playground.springhibernate.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilter() {

        var registrationBean = new FilterRegistrationBean<RequestResponseLoggingFilter>();

        registrationBean.setFilter(new RequestResponseLoggingFilter());
        registrationBean.addUrlPatterns("/authors/*");

        return registrationBean;
    }

    @Bean
    public void addDummyConfig() {
        System.out.println("------->" + "dummy configuration added.");
    }
}
