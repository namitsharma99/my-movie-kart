package com.mymoviekart.booking.dto.request;

import com.mymoviekart.booking.enumeration.SeatAvailStatus;

public record SeatRequestDto(
        String rowName,
        Long seatNumber,
        SeatAvailStatus seatAvailStatus
)
{
}