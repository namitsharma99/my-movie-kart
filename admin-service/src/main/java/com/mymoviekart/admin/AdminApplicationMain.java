package com.mymoviekart.admin;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.mymoviekart.admin"})
@OpenAPIDefinition
public class AdminApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplicationMain.class, args);
    }

}