package com.nickpanaiotov.b;


import com.nickpanaiotov.c.C;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnCBeanStateCondition extends SpringBootCondition implements ConfigurationCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getBeanFactory().getBean(C.class);
            return ConditionOutcome.match("Bean found!!!");
        } catch (NoSuchBeanDefinitionException ex) {
            return ConditionOutcome.noMatch("Bean not found!!!");
        }
    }

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.PARSE_CONFIGURATION;
    }
}
