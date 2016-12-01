package com.techart.lab.controller;

import com.techart.lab.dto.ConnectionPropertiesDTO;
import com.techart.lab.service.connectionproperties.IConnectionPropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexander on 11/20/16.
 */
@RestController
@RequestMapping("/properties")
public class ConnectionPropertiesController {

    @Autowired
    private IConnectionPropertiesService connectionPropertiesService;

    @RequestMapping(method = RequestMethod.GET)
    public ConnectionPropertiesDTO get() {
        return connectionPropertiesService.get();
    }
}
