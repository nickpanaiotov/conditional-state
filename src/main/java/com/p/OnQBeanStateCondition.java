package com.p;

import com.q.Q;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class OnQBeanStateCondition extends SpringBootCondition implements ConfigurationCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            Q q = context.getBeanFactory().getBean(Q.class);
            if (q.isSomeState()) {
                return ConditionOutcome.match("Bean found!!!");
            }

            return ConditionOutcome.noMatch("Bean found, but is in unappropriate state!!!");
        } catch (NoSuchBeanDefinitionException ex) {
            return ConditionOutcome.noMatch("Bean not found!!!");
        }
    }

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.PARSE_CONFIGURATION;
    }
}
