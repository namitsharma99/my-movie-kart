package com.mymoviekart.theatrepartner.controller;

import com.mymoviekart.theatrepartner.dto.request.PartnerRequestDto;
import com.mymoviekart.theatrepartner.dto.response.PartnerResponseDto;
import com.mymoviekart.theatrepartner.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class PartnerController {

    @Autowired
    PartnerService partnerService;

    @GetMapping("/partner/health")
    public String getStatus() {
        return "theatre-partner-service partner controller: OK";
    }

    @GetMapping("/partners/{partnerid}")
    public PartnerResponseDto getPartnerById(@PathVariable Long partnerid) {
        return partnerService.getPartnerById(partnerid);
    }

    @GetMapping("/partners")
    public List<PartnerResponseDto> getAllPartners() {
        return partnerService.getAllPartners();
    }

    @PostMapping("/partner")
    public PartnerResponseDto createPartner(@RequestBody PartnerRequestDto partner) {
        return partnerService.createPartner(partner);
    }
}