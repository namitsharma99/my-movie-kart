package com.mymoviekart.admin.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class AdminController {

    @GetMapping("/admin/health")
    public String getStatus() {
        return "admin-service admin controller: OK";
    }


}