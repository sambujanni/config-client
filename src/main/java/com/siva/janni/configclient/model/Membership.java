package com.siva.janni.configclient.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Membership {
    @Autowired
    private Environment environment;
    public String getModel() {
        return environment.getProperty("vehicle.default.model");
    }
    public String getMinRent() {
        return environment.getProperty("member.rent.min");
    }
}
