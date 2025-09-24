package com.mymoviekart.booking.repository;

import com.mymoviekart.booking.dto.response.TheatreAudiMovieSeatMvResponseDto;
import com.mymoviekart.booking.entity.TheatreAudiMovieSeatMvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreAudiMovieSeatMvRepository extends JpaRepository<TheatreAudiMovieSeatMvEntity, Long> {

    List<TheatreAudiMovieSeatMvEntity> findByTheatreStateAndTheatreCityAndMovieName(String state, String city, String movieName);

}
