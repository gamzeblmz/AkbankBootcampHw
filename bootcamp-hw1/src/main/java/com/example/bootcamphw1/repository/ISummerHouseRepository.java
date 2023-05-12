package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.SummerHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISummerHouseRepository extends JpaRepository<SummerHouse,Long> {
    @Query("SELECT SUM(sh.price) FROM SummerHouse sh")
    Double getTotalPrice();
    @Query("SELECT AVG(sh.meters) FROM SummerHouse sh")
    Double getAvgMeters();
    @Query("SELECT sh FROM SummerHouse sh where sh.totalNumberOfHalls= :halls and sh.totalNumberOfRooms= :rooms")
    List<SummerHouse> getByTotalNumberOfHallsAndTotalNumberOfRooms(int halls, int rooms);
}
