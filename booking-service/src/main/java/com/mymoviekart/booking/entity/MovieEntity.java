package com.mymoviekart.booking.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mymoviekart.booking.enumeration.MovieGenre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MMK_MOVIE")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MOVIE_NAME", nullable = false)
    private String movieName;

    @Column(name = "LANGUAGE", nullable = false)
    private String language;

    @Column(name = "DURATION", nullable = false)
    private String duration;

    @Column(name = "SHOW_DAY")
    private String showDay;

    @Column(name = "START_TIME")
    private String startTime;

    @Column(name = "END_TIME")
    private String endTime;

    @Column(name = "RELEASE_DATE", nullable = false)
    private String releaseDate;

    @Column(name = "MOVIE_GENRE", nullable = false)
    private MovieGenre movieGenre;

    @Column(name = "CASTING", nullable = false)
    private String casting;

    @Column(name = "DIRECTOR", nullable = false)
    private String director;

    @Column(name = "PRODUCER", nullable = false)
    private String producer;

    @Column(name = "PRODUCTION_COMPANY", nullable = false)
    private String productionCompany;

    @Column(name = "BUDGET", nullable = false)
    private Double budget;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "AUDITORIUM_ID", nullable = false)
    @JsonBackReference
    private AuditoriumEntity auditorium;

}