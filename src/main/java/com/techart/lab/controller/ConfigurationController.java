package com.techart.lab.controller;

import com.techart.lab.config.IConfiguration;
import com.techart.lab.dto.ConfigurationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexander on 11/21/16.
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigurationController {

    @Autowired
    private IConfiguration configuration;

    @RequestMapping(method = RequestMethod.GET)
    public ConfigurationDTO getProperty() {
        return new ConfigurationDTO(configuration.getProperty());
    }
}
