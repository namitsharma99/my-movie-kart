package com.mymoviekart.booking.mapper;

import com.mymoviekart.booking.dto.response.TheatreAudiMovieSeatMvResponseDto;
import com.mymoviekart.booking.entity.TheatreAudiMovieSeatMvEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface TheatreAudiMovieSeatMvDtoEntityMapper {

    TheatreAudiMovieSeatMvResponseDto toDto (TheatreAudiMovieSeatMvEntity theatreEntity);
    List<TheatreAudiMovieSeatMvResponseDto> toDto (List<TheatreAudiMovieSeatMvEntity> theatreEntityList);

}
