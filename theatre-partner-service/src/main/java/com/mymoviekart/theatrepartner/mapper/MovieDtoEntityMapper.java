package com.mymoviekart.theatrepartner.mapper;

import com.mymoviekart.theatrepartner.dto.request.MovieRequestDto;
import com.mymoviekart.theatrepartner.dto.response.MovieResponseDto;
import com.mymoviekart.theatrepartner.entity.MovieEntity;
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
