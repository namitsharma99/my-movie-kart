package com.mymoviekart.theatrepartner.dto.request;

import com.mymoviekart.theatrepartner.enumeration.SeatAvailStatus;

public record SeatRequestDto(
        String rowName,
        Long seatNumber,
        SeatAvailStatus seatAvailStatus
)
{
}