package com.mymoviekart.booking;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mymoviekart.booking"})
@OpenAPIDefinition
@EnableJpaAuditing
public class BookingApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(BookingApplicationMain.class, args);
    }

}