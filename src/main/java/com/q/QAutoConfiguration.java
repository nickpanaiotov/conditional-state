package com.q;

import org.springframework.context.annotation.Configuration;

@Configuration
public class QAutoConfiguration {


    public Q q() {
        return new Q(true);
    }
}
