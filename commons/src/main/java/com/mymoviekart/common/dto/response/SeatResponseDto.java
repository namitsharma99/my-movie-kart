package com.mymoviekart.common.dto.response;

import com.mymoviekart.common.enumeration.SeatAvailStatus;
import lombok.Data;

@Data
public class SeatResponseDto {
    
    private Long id;
    private Long auditoriumId;
    private String rowName;
    private Long seatNumber;
    private SeatAvailStatus seatAvailStatus;

}
