package com.mymoviekart.theatrepartner.service;

import com.mymoviekart.theatrepartner.dto.request.TheatreRequestDto;
import com.mymoviekart.theatrepartner.dto.response.TheatreResponseDto;
import com.mymoviekart.theatrepartner.entity.PartnerEntity;
import com.mymoviekart.theatrepartner.entity.TheatreEntity;
import com.mymoviekart.theatrepartner.mapper.TheatreDtoEntityMapper;
import com.mymoviekart.theatrepartner.repository.PartnerRepository;
import com.mymoviekart.theatrepartner.repository.TheatreRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private PartnerRepository partnerRepository;

    public List<TheatreResponseDto> getAllTheatreByPartnerId(Long partnerid) {
        TheatreDtoEntityMapper mapper = Mappers.getMapper(TheatreDtoEntityMapper.class);
        return mapper.toDto(theatreRepository.findByPartnerId(partnerid));
    }

    public TheatreResponseDto getTheatreById(Long theatreid) {
        TheatreDtoEntityMapper mapper = Mappers.getMapper(TheatreDtoEntityMapper.class);
        return mapper.toDto(theatreRepository.findById(theatreid).orElse(null));
    }

    public TheatreResponseDto createTheatre(TheatreRequestDto theatreRequestDto) throws Exception {
        Long partnerId = theatreRequestDto.partnerId();
        PartnerEntity partnerEntity = partnerRepository.findById(partnerId).orElse(null);
        if (partnerEntity == null) {
            throw new Exception("Invalid partner id");
        }

        TheatreDtoEntityMapper mapper = Mappers.getMapper(TheatreDtoEntityMapper.class);
        TheatreEntity theatreEntity = mapper.toEntity(theatreRequestDto);
        // theatreEntity.setActive(false);
        TheatreEntity persistedTheatreEntity = theatreRepository.save(theatreEntity);
        return mapper.toDto(persistedTheatreEntity);
    }
}
