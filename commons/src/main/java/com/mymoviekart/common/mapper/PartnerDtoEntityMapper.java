package com.mymoviekart.common.mapper;

import com.mymoviekart.common.dto.request.PartnerRequestDto;
import com.mymoviekart.common.dto.response.PartnerResponseDto;
import com.mymoviekart.common.entity.PartnerEntity;
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
