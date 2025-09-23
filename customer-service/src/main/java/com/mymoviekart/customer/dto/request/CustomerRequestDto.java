package com.mymoviekart.customer.dto.request;

public record CustomerRequestDto
        (
                String customerName,
                String emailId,
                String contactNumber,
                String nationality,
                String nationalId

        )
{
}