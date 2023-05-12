package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.SummerHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ISummerHouseRepository extends JpaRepository<SummerHouse,Long> {
    @Query("SELECT SUM(sh.price) FROM SummerHouse sh")
    Double getTotalPrice();
}
