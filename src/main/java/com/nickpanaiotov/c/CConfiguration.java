package com.nickpanaiotov.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CConfiguration {
    @Bean
    C c() {
        return new C();
    }
}
