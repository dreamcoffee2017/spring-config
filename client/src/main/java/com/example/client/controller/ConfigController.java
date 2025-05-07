package com.example.client.controller;

import com.example.client.config.SecretConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ConfigController {

    @Autowired
    private SecretConfig secretConfig;

    @GetMapping
    public String get() {
        return secretConfig.getSecret();
    }
}
