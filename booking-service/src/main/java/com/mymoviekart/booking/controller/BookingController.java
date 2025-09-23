package com.mymoviekart.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class BookingController {

//    @Autowired
//    BookingService bookingService;

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

}