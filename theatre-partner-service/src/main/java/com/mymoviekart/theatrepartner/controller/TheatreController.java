package com.mymoviekart.theatrepartner.controller;

import com.mymoviekart.theatrepartner.dto.request.TheatreRequestDto;
import com.mymoviekart.theatrepartner.dto.response.TheatreResponseDto;
import com.mymoviekart.theatrepartner.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @GetMapping("/theatre/health")
    public String getStatus() {
        return "theatre-partner-service theatre controller: OK";
    }

    @GetMapping("/theatres/{theatreid}")
    public TheatreResponseDto getTheatreById(@PathVariable Long theatreid) {
        return theatreService.getTheatreById(theatreid);
    }

    @GetMapping("/partners/{partnerid}/theatres")
    public List<TheatreResponseDto> getAllTheatreByPartnerId(@PathVariable Long partnerid) {
        return theatreService.getAllTheatreByPartnerId(partnerid);
    }

    @PostMapping("/theatre")
    public TheatreResponseDto createPartner(@RequestBody TheatreRequestDto theatreRequestDto) throws Exception {
        return theatreService.createTheatre(theatreRequestDto);
    }

}
