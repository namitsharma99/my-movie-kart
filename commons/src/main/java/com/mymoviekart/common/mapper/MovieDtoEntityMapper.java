package com.mymoviekart.common.mapper;

import com.mymoviekart.common.dto.request.MovieRequestDto;
import com.mymoviekart.common.dto.response.MovieResponseDto;
import com.mymoviekart.common.entity.MovieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface MovieDtoEntityMapper {

    MovieResponseDto toDto(MovieEntity movieEntity);
    List<MovieResponseDto> toDto(List<MovieEntity> movieEntityList);

    MovieEntity toEntity(MovieRequestDto movieRequestDto);
    List<MovieEntity> toEntity(List<MovieRequestDto> movieRequestDtoList);

}
