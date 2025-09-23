package com.mymoviekart.theatrepartner.repository;

import com.mymoviekart.theatrepartner.entity.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<SeatEntity, Long> {

}
