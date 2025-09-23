package com.mymoviekart.common.mapper;

import com.mymoviekart.common.dto.request.SeatRequestDto;
import com.mymoviekart.common.dto.response.SeatResponseDto;
import com.mymoviekart.common.entity.SeatEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface SeatDtoEntityMapper {

    SeatResponseDto toDto(SeatEntity seatEntity);
    List<SeatResponseDto> toDto(List<SeatEntity> seatEntityList);

    SeatEntity toEntity(SeatRequestDto seatRequestDto);
    List<SeatEntity> toEntity(List<SeatRequestDto> seatRequestDtoList);

}
