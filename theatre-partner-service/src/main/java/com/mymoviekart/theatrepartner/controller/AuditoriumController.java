package com.mymoviekart.theatrepartner.controller;

import com.mymoviekart.theatrepartner.dto.request.AuditoriumRequestDto;
import com.mymoviekart.theatrepartner.dto.response.AuditoriumResponseDto;
import com.mymoviekart.theatrepartner.service.AuditoriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AuditoriumController {

    @Autowired
    AuditoriumService auditoriumService;

    @GetMapping("/auditorium/health")
    public String getStatus() {
        return "theatre-partner-service auditorium controller: OK";
    }

    @GetMapping("/auditoriums/{auditoriumid}")
    public AuditoriumResponseDto getAuditoriumById(@PathVariable Long auditoriumid) {
        return auditoriumService.getAuditoriumById(auditoriumid);
    }

    @GetMapping("/theatres/{theatreid}/auditoriums")
    public List<AuditoriumResponseDto> getAllAuditoriumsByTheatreId(@PathVariable Long theatreid) {
        return auditoriumService.getAllAuditoriumsByTheatreId(theatreid);
    }

    @PostMapping("/auditorium")
    public AuditoriumResponseDto createAuditorium(@RequestBody AuditoriumRequestDto auditoriumRequestDto) throws Exception {
        return auditoriumService.createAuditorium(auditoriumRequestDto);
    }

}