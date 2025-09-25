package com.mymoviekart.notification;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mymoviekart.notification"})
@OpenAPIDefinition
@EnableJpaAuditing
public class NotificationApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplicationMain.class, args);
    }

}