package com.mymoviekart.booking.dto.request;

public record PartnerRequestDto
        (
                String partnerName,
                String emailId,
                String contactNumber,
                String nationality,
                String nationalId
                // boolean approved
        )
{
}