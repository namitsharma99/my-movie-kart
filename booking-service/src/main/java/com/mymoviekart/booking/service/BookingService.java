package com.mymoviekart.booking.service;

import com.mymoviekart.booking.dto.response.TheatreAudiMovieSeatMvResponseDto;
import com.mymoviekart.booking.dto.response.TheatreResponseDto;
import com.mymoviekart.booking.entity.TheatreAudiMovieSeatMvEntity;
import com.mymoviekart.booking.mapper.TheatreAudiMovieSeatMvDtoEntityMapper;
import com.mymoviekart.booking.repository.*;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private TheatreAudiMovieSeatMvRepository theatreAudiMovieSeatMvRepository;

    public List<TheatreAudiMovieSeatMvResponseDto> getTheatresPerCityAndMovie(String state, String city, String movieName) {
        TheatreAudiMovieSeatMvDtoEntityMapper mapper = Mappers.getMapper(TheatreAudiMovieSeatMvDtoEntityMapper.class);
        List<TheatreAudiMovieSeatMvEntity> theatreAudiMovieSeatMvEntityList = theatreAudiMovieSeatMvRepository.findByTheatreStateAndTheatreCityAndMovieName(state, city, movieName);
        return mapper.toDto(theatreAudiMovieSeatMvEntityList);
    }

//    public List<BookingResponseDto> getAllBookings() {
//        BookingDtoEntityMapper mapper = Mappers.getMapper(BookingDtoEntityMapper.class);
//        return mapper.toDto(bookingRepository.findAll());
//    }
//
//    public BookingResponseDto getBookingById(Long id) {
//        BookingDtoEntityMapper mapper = Mappers.getMapper(BookingDtoEntityMapper.class);
//        BookingEntity bookingEntity = bookingRepository.findById(id).orElse(null);
//        return mapper.toDto(bookingEntity);
//    }
//
//    public BookingResponseDto createBooking(BookingRequestDto bookingRequestDto) {
//        BookingDtoEntityMapper mapper = Mappers.getMapper(BookingDtoEntityMapper.class);
//        BookingEntity bookingEntity = mapper.toEntity(bookingRequestDto);
//        BookingEntity persistedBookingEntity = bookingRepository.save(bookingEntity);
//        return mapper.toDto(persistedBookingEntity);
//    }



}
