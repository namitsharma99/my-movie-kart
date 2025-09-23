package com.mymoviekart.theatrepartner.mapper;

import com.mymoviekart.theatrepartner.dto.request.PartnerRequestDto;
import com.mymoviekart.theatrepartner.dto.response.PartnerResponseDto;
import com.mymoviekart.theatrepartner.entity.PartnerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PartnerDtoEntityMapper {

    PartnerResponseDto toDto (PartnerEntity partnerEntity);
    List<PartnerResponseDto> toDto (List<PartnerEntity> partnerEntityList);

    PartnerEntity toEntity(PartnerRequestDto partnerRequestDto);
    List<PartnerEntity> toEntity(List<PartnerRequestDto> partnerRequestDtoList);

}
