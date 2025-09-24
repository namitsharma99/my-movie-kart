package com.mymoviekart.booking.dto.response;

import lombok.Data;

@Data
public class TheatreResponseDto {
    
    private Long id;
    private Long partnerId;
    private String theatreName;
    private String address;
    private String city;
    private String state;
    private String country;
    private String createdDate;
    private boolean active;

}
