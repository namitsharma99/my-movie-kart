package com.mymoviekart.theatrepartner.repository;

import com.mymoviekart.theatrepartner.entity.AuditoriumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditoriumRepository extends JpaRepository<AuditoriumEntity, Long> {
    List<AuditoriumEntity> findByTheatreId(Long theatreId);
}
