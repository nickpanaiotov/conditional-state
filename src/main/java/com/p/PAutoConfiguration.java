package com.p;


import com.q.QAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(QAutoConfiguration.class)
public class PAutoConfiguration {


    @Bean
    @ConditionalOnBean(QAutoConfiguration.class)
    P p() {
        return new P();
    }

    @Bean
    @Conditional(OnQBeanStateCondition.class)
    P qStateDependent() {
        return new P("------------------PAutoConfiguration-qStateDependent-------------------");
    }
}
