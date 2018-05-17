package com.nickpanaiotov.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfiguration {

    @Bean
    public A a() {
        return new A(true);
    }
}