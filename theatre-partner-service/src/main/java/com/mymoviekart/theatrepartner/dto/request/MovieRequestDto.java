package com.mymoviekart.theatrepartner.dto.request;

import com.mymoviekart.theatrepartner.enumeration.MovieGenre;

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