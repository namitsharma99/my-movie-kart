package com.mymoviekart.booking.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MMK_AUDITORIUM")
public class AuditoriumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "THEATRE_ID", nullable = false)
    private Long theatreId;

    @Column(name = "AUDITORIUM_NAME", nullable = false)
    private String auditoriumName;

    @OneToMany(mappedBy = "auditorium", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    List<SeatEntity> seatEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "auditorium", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    List<MovieEntity> movieEntityList = new ArrayList<>();

    @CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false, updatable = false)
    private Date createdDate;

}
