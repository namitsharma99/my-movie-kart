package com.mymoviekart.theatrepartner.mapper;

import com.mymoviekart.theatrepartner.dto.request.SeatRequestDto;
import com.mymoviekart.theatrepartner.dto.response.SeatResponseDto;
import com.mymoviekart.theatrepartner.entity.SeatEntity;
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
