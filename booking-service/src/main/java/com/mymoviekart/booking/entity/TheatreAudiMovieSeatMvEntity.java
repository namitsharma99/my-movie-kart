package com.mymoviekart.booking.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mymoviekart.booking.enumeration.MovieGenre;
import com.mymoviekart.booking.enumeration.SeatAvailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity
@Data
@Immutable // because MV is read-only in this code
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mmk_theatre_audi_movie_seat_flat_mv")
public class TheatreAudiMovieSeatMvEntity {

//    THEATRE_ID, THEATRE_NAME, THEATRE_ACTIVE, THEATRE_ADDRESS, THEATRE_CITY, THEATRE_STATE, THEATRE_COUNTRY, THEATRE_PARTNER_ID,
    @Id
    @Column(name = "theatre_id")
    private Long theatreId;

    @Column(name = "theatre_name")
    private String theatreName;

    @Column(name = "theatre_active")
    private Boolean theatreActive;

    @Column(name = "theatre_address")
    private String theatreAddress;

    @Column(name = "theatre_city")
    private String theatreCity;

    @Column(name = "theatre_state")
    private String theatreState;

    @Column(name = "theatre_country")
    private String theatreCountry;

    @Column(name = "theatre_partner_id")
    private Long theatrePartnerId;


//    AUDITORIUM_ID, AUDITORIUM_NAME,
    @Column(name = "AUDITORIUM_ID")
    private Long auditoriumId;

    @Column(name = "AUDITORIUM_NAME")
    private String auditoriumName;


//    MOVIE_ID, MOVIE_BUDGET, MOVIE_CASTING, MOVIE_DIRECTOR, MOVIE_PRODUCER, MOVIE_PRODUCTION_COMPANY, MOVIE_RELEASED_DATE, MOVIE_GENRE, MOVIE_LANGUAGE, MOVIE_DURATION, MOVIE_START_TIME, MOVIE_END_TIME, MOVIE_SHOW_DATE,
    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "MOVIE_BUDGET")
    private Double movieBudget;

    @Column(name = "MOVIE_CASTING")
    private String movieCasting;

    @Column(name = "MOVIE_DIRECTOR")
    private String movieDirector;

    @Column(name = "MOVIE_PRODUCER")
    private String movieProducer;

    @Column(name = "MOVIE_PRODUCTION_COMPANY")
    private String movieProductionCompany;

    @Column(name = "MOVIE_RELEASED_DATE")
    private String movieReleasedDate;

    @Column(name = "MOVIE_GENRE")
    private MovieGenre movieGenre;

    @Column(name = "MOVIE_LANGUAGE")
    private String movieLanguage;

    @Column(name = "MOVIE_DURATION")
    private String movieDuration;

    @Column(name = "MOVIE_START_TIME")
    private String movieStartTime;

    @Column(name = "MOVIE_END_TIME")
    private String movieEndTime;

    @Column(name = "MOVIE_SHOW_DATE")
    private String movieShowDate;


//    SEAT_ID, SEAT_ROW, SEAT_AVAILABILITY, SEAT_NUMBER
    @Column(name = "SEAT_ID")
    private Long seatId;

    @Column(name = "SEAT_ROW")
    private String seatRow;

    @Column(name = "SEAT_NUMBER")
    private Integer seatNumber;

    @Column(name = "SEAT_AVAILABILITY")
    private SeatAvailStatus seatAvailability;


}