package com.mymoviekart.booking.controller;

import com.mymoviekart.booking.dto.response.TheatreAudiMovieSeatMvResponseDto;
import com.mymoviekart.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/booking/health")
    public String getStatus() {
        return "booking-service booking controller: OK";
    }
//
//    @GetMapping("/bookings")
//    public List<BookingResponseDto> getAllBookings() {
//        return bookingService.getAllBookings();
//    }
//
//    @GetMapping("/partners/{bookingId}")
//    public BookingResponseDto getBookingById(@PathVariable Long bookingId) {
//        return bookingService.getBookingById(bookingId);
//    }
//
//    @PostMapping("/booking")
//    public BookingResponseDto createBooking(@RequestBody BookingRequestDto booking) {
//        return bookingService.createBooking(booking);
//    }

    @GetMapping("/booking/theatres")
    public List<TheatreAudiMovieSeatMvResponseDto> getTheatres(
            @RequestParam(name = "state") String state,
            @RequestParam(name = "city") String city,
            @RequestParam(name = "movie") String movieName) {
        return bookingService.getTheatresPerCityAndMovie(state, city, movieName);
    }

}