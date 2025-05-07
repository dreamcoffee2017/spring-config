package com.example.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.endpoint.RefreshBusEndpoint;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class ServerApplication {

    @Bean
    public CommandLineRunner init(RefreshBusEndpoint refreshBusEndpoint) {
        return args -> refreshBusEndpoint.busRefresh();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

}
