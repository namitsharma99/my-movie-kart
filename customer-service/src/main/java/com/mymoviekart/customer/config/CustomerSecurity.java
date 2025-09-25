//package com.mymoviekart.customer.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class CustomerSecurity {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/v1/**").permitAll()
//                        .requestMatchers("/v3/api-docs/**").permitAll() // OpenAPI 3 documentation
//                        .requestMatchers("/swagger-ui/**").permitAll() // Swagger UI webjar resources
//                        .requestMatchers("/swagger-ui.html").permitAll() // Swagger UI index page
//                        .anyRequest().authenticated()
//                )
////                .formLogin(form -> form
////                        .loginPage("/login")
////                        .permitAll()
////                )
//                .logout(LogoutConfigurer::permitAll);
//        return http.build();
//    }
//
//}
