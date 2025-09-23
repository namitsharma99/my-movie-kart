package com.mymoviekart.common.mapper;

import com.mymoviekart.common.dto.request.AuditoriumRequestDto;
import com.mymoviekart.common.dto.response.AuditoriumResponseDto;
import com.mymoviekart.common.entity.AuditoriumEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface AuditoriumDtoEntityMapper {

    AuditoriumResponseDto toDto(AuditoriumEntity auditoriumEntity);
    List<AuditoriumResponseDto> toDto(List<AuditoriumEntity> auditoriumEntityList);

    AuditoriumEntity toEntity(AuditoriumRequestDto auditoriumRequestDto);
    List<AuditoriumEntity> toEntity(List<AuditoriumRequestDto> auditoriumRequestDtoList);

}
