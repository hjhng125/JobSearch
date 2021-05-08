package com.jh.project.config;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableConfigurationProperties({JpaProperties.class, HibernateProperties.class})
public class DataSourceProperties {

    private final JpaProperties jpaProperties;
    private final HibernateProperties hibernateProperties;

    public Map<String, Object> getProperties() {
        return new LinkedHashMap<>(hibernateProperties.determineHibernateProperties(
            jpaProperties.getProperties(),
            new HibernateSettings()));
    }
}
