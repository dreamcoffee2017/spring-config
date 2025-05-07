package com.example.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class SecretConfig {

    @Value("${secret}")
    private String secret;

    public String getSecret() {
        return secret;
    }
}
