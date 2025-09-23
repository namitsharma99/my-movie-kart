package com.mymoviekart.common.mapper;

import com.mymoviekart.common.dto.request.TheatreRequestDto;
import com.mymoviekart.common.dto.response.TheatreResponseDto;
import com.mymoviekart.common.entity.TheatreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface TheatreDtoEntityMapper {

    TheatreResponseDto toDto (TheatreEntity theatreEntity);
    List<TheatreResponseDto> toDto (List<TheatreEntity> theatreEntityList);

    TheatreEntity toEntity(TheatreRequestDto theatreRequestDto);
    List<TheatreEntity> toEntity(List<TheatreRequestDto> theatreRequestDtoList);

}
