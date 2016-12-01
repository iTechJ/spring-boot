package com.techart.lab.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by alexander on 11/21/16.
 */
@Component
@Profile("prod")
@ConfigurationProperties(prefix = "prod")
public class ProdConfiguration implements IConfiguration{

    private String property;

    @Override
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
