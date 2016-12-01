package com.techart.lab.service.connectionproperties;

import com.techart.lab.config.ConnectionProperties;
import com.techart.lab.dto.ConnectionPropertiesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by alexander on 11/21/16.
 */
@Service
public class ConnectionPropertiesService implements IConnectionPropertiesService {

    @Autowired
    private ConnectionProperties connectionProperties;

    public ConnectionPropertiesDTO get() {
        if (Objects.nonNull(connectionProperties)) {
            return new ConnectionPropertiesDTO(connectionProperties.getUsername(), connectionProperties.getRemoteAddress());
        } else {
            return new ConnectionPropertiesDTO();
        }
    }
}
