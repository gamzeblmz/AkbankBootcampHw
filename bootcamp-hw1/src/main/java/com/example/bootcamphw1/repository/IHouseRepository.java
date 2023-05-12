package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IHouseRepository extends JpaRepository<House,Long> {
    @Query("SELECT SUM(h.price) FROM House h")
    Double getTotalPrice();
}
