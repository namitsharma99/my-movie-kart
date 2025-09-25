package com.mymoviekart.recommendation.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.mymoviekart.recommendation.controller"})
public class RecommendationApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(RecommendationApplicationMain.class, args);
    }

}