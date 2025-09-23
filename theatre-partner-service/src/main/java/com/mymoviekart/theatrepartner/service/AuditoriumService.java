package com.mymoviekart.theatrepartner.service;

import com.mymoviekart.theatrepartner.dto.request.AuditoriumRequestDto;
import com.mymoviekart.theatrepartner.dto.request.MovieRequestDto;
import com.mymoviekart.theatrepartner.dto.request.SeatRequestDto;
import com.mymoviekart.theatrepartner.dto.response.AuditoriumResponseDto;
import com.mymoviekart.booking.entity.*;
import com.mymoviekart.theatrepartner.entity.AuditoriumEntity;
import com.mymoviekart.theatrepartner.entity.MovieEntity;
import com.mymoviekart.theatrepartner.entity.SeatEntity;
import com.mymoviekart.theatrepartner.entity.TheatreEntity;
import com.mymoviekart.theatrepartner.mapper.AuditoriumDtoEntityMapper;
import com.mymoviekart.theatrepartner.mapper.MovieDtoEntityMapper;
import com.mymoviekart.theatrepartner.mapper.SeatDtoEntityMapper;
import com.mymoviekart.booking.repository.*;
import com.mymoviekart.theatrepartner.repository.AuditoriumRepository;
import com.mymoviekart.theatrepartner.repository.MovieRepository;
import com.mymoviekart.theatrepartner.repository.SeatRepository;
import com.mymoviekart.theatrepartner.repository.TheatreRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<AuditoriumResponseDto> getAllAuditoriumsByTheatreId(Long theatreId) {
        AuditoriumDtoEntityMapper mapper = Mappers.getMapper(AuditoriumDtoEntityMapper.class);
        return mapper.toDto(auditoriumRepository.findByTheatreId(theatreId));
    }

    public AuditoriumResponseDto getAuditoriumById(Long auditoriumId) {
        AuditoriumDtoEntityMapper mapper = Mappers.getMapper(AuditoriumDtoEntityMapper.class);
        AuditoriumEntity auditoriumEntity = auditoriumRepository.findById(auditoriumId).orElse(null);
        return mapper.toDto(auditoriumEntity);
    }

    public AuditoriumResponseDto createAuditorium(AuditoriumRequestDto auditoriumRequestDto) throws Exception {
        Long theatreId = auditoriumRequestDto.theatreId();
        TheatreEntity theatreEntity = theatreRepository.findById(theatreId).orElse(null);
        if (theatreEntity == null) {
            throw new Exception("Invalid theatre id");
        }

        AuditoriumDtoEntityMapper auditoriumMapper = Mappers.getMapper(AuditoriumDtoEntityMapper.class);
        AuditoriumEntity auditoriumEntity =  auditoriumRepository.save(auditoriumMapper.toEntity(auditoriumRequestDto));

        Long auditoriumId = auditoriumEntity.getId();

        List<MovieRequestDto> movieRequestDtoList = auditoriumRequestDto.movieRequestDtoList();
        MovieDtoEntityMapper movieMapper = Mappers.getMapper(MovieDtoEntityMapper.class);
        List<MovieEntity> movieEntityList = movieMapper.toEntity(movieRequestDtoList);
        movieEntityList = movieEntityList
                .stream()
                .peek(movieEntity -> movieEntity.setAuditorium(auditoriumEntity))
                .toList();
        List<MovieEntity> movieEntityResponseList = movieRepository.saveAll(movieEntityList);

        List<SeatRequestDto> seatRequestDtoList = auditoriumRequestDto.seatRequestDtoList();
        SeatDtoEntityMapper seatMapper = Mappers.getMapper(SeatDtoEntityMapper.class);
        List<SeatEntity> seatEntityList = seatMapper.toEntity(seatRequestDtoList);
        seatEntityList = seatEntityList
                .stream()
                .peek(seatEntity -> seatEntity.setAuditorium(auditoriumEntity))
                .toList();
        List<SeatEntity> seatEntityResponseList = seatRepository.saveAll(seatEntityList);

        auditoriumEntity.setMovieEntityList(movieEntityList);
        auditoriumEntity.setSeatEntityList(seatEntityResponseList);

        return auditoriumMapper.toDto(auditoriumEntity);
    }

}
