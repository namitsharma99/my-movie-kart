//package com.mymoviekart.theatrepartner.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class TheatrePartnerSecurity {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/v1/**","/v3/api-docs/**","/swagger-ui/**","/swagger-ui.html","/swagger.json/**","/docs/**").permitAll()
//                        .anyRequest().authenticated()
//                ).csrf(AbstractHttpConfigurer::disable);
////                .formLogin(form -> form
////                        .loginPage("/login")
////                        .permitAll()
////                )
////                 .logout(LogoutConfigurer::permitAll);
//        return http.build();
//    }
//
//}
