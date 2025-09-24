package com.mymoviekart.booking.dto.response;

import lombok.Data;

@Data
public class PartnerResponseDto {

    private Long id;
    private String partnerName;
    private String emailId;
    private String contactNumber;
    private String nationality;
    private String nationalId;
    private String createdDate;
    private boolean approved;

}
