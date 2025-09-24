package com.mymoviekart.booking.dto.response;

import com.mymoviekart.booking.enumeration.SeatAvailStatus;
import lombok.Data;

@Data
public class SeatResponseDto {
    
    private Long id;
    private Long auditoriumId;
    private String rowName;
    private Long seatNumber;
    private SeatAvailStatus seatAvailStatus;

}
