package com.mymoviekart.theatrepartner.repository;

import com.mymoviekart.theatrepartner.entity.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<TheatreEntity, Long> {

    List<TheatreEntity> findByPartnerId(Long partnerid);

}
