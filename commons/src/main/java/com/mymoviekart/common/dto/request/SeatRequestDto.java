package com.mymoviekart.common.dto.request;

import com.mymoviekart.common.enumeration.SeatAvailStatus;

public record SeatRequestDto(
        String rowName,
        Long seatNumber,
        SeatAvailStatus seatAvailStatus
)
{
}