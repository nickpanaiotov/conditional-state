package com.nickpanaiotov.b;

import com.nickpanaiotov.c.C;
import com.nickpanaiotov.a.A;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BConfiguration {


    @Bean
//    @Conditional(OnABeanStateCondition.class)
    @ConditionalOnBean(A.class)
    public BService bService(A a) {
        if (a.isSomeState()){
            //configure in specific way
        }
        System.out.println("------------------AAAAAAAAAAA------------");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("------------------AAAAAAAAAAA------------");
        return new BService();
    }

    @Bean
    @Conditional(OnCBeanStateCondition.class)
//    @ConditionalOnBean(C.class)
    public BService anotherBService(C c) {
        System.out.println("------------------CCCCCCCCCCC------------");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("-                                       -");
        System.out.println("------------------CCCCCCCCCCC------------");
        return new BService();
    }
}
