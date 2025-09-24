package com.mymoviekart.booking.mapper;

import com.mymoviekart.booking.dto.request.PartnerRequestDto;
import com.mymoviekart.booking.dto.response.PartnerResponseDto;
import com.mymoviekart.booking.entity.PartnerEntity;
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
