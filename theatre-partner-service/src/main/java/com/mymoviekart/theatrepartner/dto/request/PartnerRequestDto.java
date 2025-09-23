package com.mymoviekart.theatrepartner.dto.request;

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