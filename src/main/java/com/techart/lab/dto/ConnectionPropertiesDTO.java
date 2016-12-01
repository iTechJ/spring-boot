package com.techart.lab.dto;

/**
 * Created by alexander on 11/20/16.
 */
public class ConnectionPropertiesDTO {

    private String username;

    private String remoteAddress;

    public ConnectionPropertiesDTO() {}

    public ConnectionPropertiesDTO(String username, String remoteAddress) {
        this.username = username;
        this.remoteAddress = remoteAddress;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRemoteAddress() {
        return remoteAddress;
    }

    public void setRemoteAddress(String remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
