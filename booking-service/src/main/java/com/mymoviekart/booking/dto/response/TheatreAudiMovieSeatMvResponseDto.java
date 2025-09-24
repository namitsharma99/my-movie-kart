package com.mymoviekart.booking.dto.response;

import com.mymoviekart.booking.enumeration.MovieGenre;
import com.mymoviekart.booking.enumeration.SeatAvailStatus;
import lombok.Data;

@Data
public class TheatreAudiMovieSeatMvResponseDto {

    private Long theatreId;

    private String theatreName;

    private Boolean theatreActive;

    private String theatreAddress;

    private String theatreCity;

    private String theatreState;

    private String theatreXountry;

    private Long theatrePartnerId;

    //    AUDITORIUM_ID, AUDITORIUM_NAME,
    private Long auditoriumId;

    private String auditoriumName;

    //    MOVIE_ID, MOVIE_BUDGET, MOVIE_CASTING, MOVIE_DIRECTOR, MOVIE_PRODUCER, MOVIE_PRODUCTION_COMPANY, MOVIE_RELEASED_DATE, MOVIE_GENRE, MOVIE_LANGUAGE, MOVIE_DURATION, MOVIE_START_TIME, MOVIE_END_TIME, MOVIE_SHOW_DATE,
    private Long movieId;

    private String movieName;

    private Double movieBudget;

    private String movieCasting;

    private String movieDirector;

    private String movieProducer;

    private String movieProductionCompany;

    private String movieReleasedDate;

    private MovieGenre movieGenre;

    private String movieLanguage;

    private String movieDuration;

    private String movieStartTime;

    private String movieEndTime;

    private String movieShowDate;

    //    SEAT_ID, SEAT_ROW, SEAT_AVAILABILITY, SEAT_NUMBER
    private Long seatId;

    private String seatRow;

    private Integer seatNumber;

    private SeatAvailStatus seatAvailability;

}
