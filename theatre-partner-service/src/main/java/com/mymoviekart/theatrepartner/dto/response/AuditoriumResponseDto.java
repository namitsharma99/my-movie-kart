package com.mymoviekart.theatrepartner.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class AuditoriumResponseDto {

    private Long id;
    private Long theatreId;
    private String auditoriumName;
    private List<MovieResponseDto> movieResponseDtoList;
    private List<SeatResponseDto> seatResponseDtoList;
    private String createdDate;

}
