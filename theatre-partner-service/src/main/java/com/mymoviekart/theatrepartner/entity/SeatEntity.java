package com.mymoviekart.theatrepartner.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mymoviekart.theatrepartner.enumeration.SeatAvailStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MMK_SEAT")
public class SeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ROW_NAME", nullable = false)
    private String rowName;

    @Column(name = "SEAT_NUMBER", nullable = false)
    private int seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_AVAIL_STATUS")
    private SeatAvailStatus seatAvailStatus;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "AUDITORIUM_ID", nullable = false)
    @JsonBackReference
    private AuditoriumEntity auditorium;
}
