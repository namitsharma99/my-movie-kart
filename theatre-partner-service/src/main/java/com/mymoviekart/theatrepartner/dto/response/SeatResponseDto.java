package com.mymoviekart.theatrepartner.dto.response;

import com.mymoviekart.theatrepartner.enumeration.SeatAvailStatus;
import lombok.Data;

@Data
public class SeatResponseDto {
    
    private Long id;
    private Long auditoriumId;
    private String rowName;
    private Long seatNumber;
    private SeatAvailStatus seatAvailStatus;

}
