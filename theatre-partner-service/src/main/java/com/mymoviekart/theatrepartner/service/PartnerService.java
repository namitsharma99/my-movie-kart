package com.mymoviekart.theatrepartner.service;

import com.mymoviekart.theatrepartner.dto.request.PartnerRequestDto;
import com.mymoviekart.theatrepartner.dto.response.PartnerResponseDto;
import com.mymoviekart.theatrepartner.entity.PartnerEntity;
import com.mymoviekart.theatrepartner.mapper.PartnerDtoEntityMapper;
import com.mymoviekart.theatrepartner.repository.PartnerRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {

    @Autowired
    private PartnerRepository partnerRepository;

    public List<PartnerResponseDto> getAllPartners() {
        PartnerDtoEntityMapper mapper = Mappers.getMapper(PartnerDtoEntityMapper.class);
        return mapper.toDto(partnerRepository.findAll());
    }

    public PartnerResponseDto getPartnerById(Long id) {
        PartnerDtoEntityMapper mapper = Mappers.getMapper(PartnerDtoEntityMapper.class);
        PartnerEntity partnerEntity = partnerRepository.findById(id).orElse(null);
        return mapper.toDto(partnerEntity);
    }

    public PartnerResponseDto createPartner(PartnerRequestDto partnerRequestDto) {
        PartnerDtoEntityMapper mapper = Mappers.getMapper(PartnerDtoEntityMapper.class);
        PartnerEntity partnerEntity = mapper.toEntity(partnerRequestDto);
        partnerEntity.setApproved(false);
        PartnerEntity persistedPartnerEntity = partnerRepository.save(partnerEntity);
        return mapper.toDto(persistedPartnerEntity);
    }
}
