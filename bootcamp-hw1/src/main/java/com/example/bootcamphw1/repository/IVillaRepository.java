package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IVillaRepository extends JpaRepository<Villa,Long> {
    @Query("SELECT SUM(v.price) FROM Villa v")
    Double getTotalPrice();
}
