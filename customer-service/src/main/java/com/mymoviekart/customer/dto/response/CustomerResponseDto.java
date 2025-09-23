package com.mymoviekart.customer.dto.response;

import lombok.Data;

@Data
public class CustomerResponseDto {

    private Long id;
    private String customerName;
    private String emailId;
    private String contactNumber;
    private String nationality;
    private String nationalId;
    private String createdDate;

}
