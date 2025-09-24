package com.mymoviekart.booking.dto.request;

import com.mymoviekart.booking.enumeration.MovieGenre;

public record MovieRequestDto(
        String movieName,
        String language,
        String duration,
        String showDay,
        String startTime,
        String endTime,
        String releaseDate,
        MovieGenre movieGenre,
        String casting,
        String director,
        String producer,
        String productionCompany,
        Double budget
)
{
}