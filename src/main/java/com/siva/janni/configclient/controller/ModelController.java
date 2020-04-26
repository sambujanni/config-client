package com.siva.janni.configclient.controller;

import com.siva.janni.configclient.model.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
    @Autowired
    private Membership membership;

    @GetMapping
    public Membership fetchModelProp() {
        return membership;
    }
}
