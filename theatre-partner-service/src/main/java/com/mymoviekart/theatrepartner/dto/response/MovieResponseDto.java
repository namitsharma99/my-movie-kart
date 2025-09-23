package com.mymoviekart.theatrepartner.dto.response;

import com.mymoviekart.theatrepartner.enumeration.MovieGenre;
import lombok.Data;

@Data
public class MovieResponseDto {
    
    private Long id;
    private Long auditoriumId;
    private String movieName;
    private String language;
    private String duration;
    private String showDay;
    private String startTime;
    private String endTime;
    private String releaseDate;
    private MovieGenre movieGenre;
    private String casting;
    private String director;
    private String producer;
    private String productionCompany;
    private Double budget;

}
