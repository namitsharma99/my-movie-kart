package com.mymoviekart.booking.dto.request;

import java.util.List;

public record AuditoriumRequestDto (
        Long theatreId,
        String auditoriumName,
        List<MovieRequestDto> movieRequestDtoList,
        List<SeatRequestDto> seatRequestDtoList
)
{
}