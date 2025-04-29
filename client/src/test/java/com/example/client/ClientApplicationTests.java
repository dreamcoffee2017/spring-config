package com.example.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientApplicationTests {
    @Value("${secret}")
    private String secret;

    @Test
    void contextLoads() {
        System.out.println(secret);
    }

}
