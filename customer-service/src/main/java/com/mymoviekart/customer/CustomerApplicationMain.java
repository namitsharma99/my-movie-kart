package com.mymoviekart.customer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mymoviekart.customer"})
@OpenAPIDefinition
@EnableJpaAuditing
public class CustomerApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplicationMain.class, args);
    }

}