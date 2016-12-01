package com.techart.lab.dto;

/**
 * Created by alexander on 11/25/16.
 */
public class ConfigurationDTO {

    private String property;

    public ConfigurationDTO(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
