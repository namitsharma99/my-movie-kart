package com.mymoviekart.theatrepartner.dto.request;


public record TheatreRequestDto (
        Long partnerId,
        String theatreName,
        String address,
        String city,
        String state,
        String country,
        boolean active
)
{
}