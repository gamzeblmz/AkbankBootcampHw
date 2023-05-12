package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVillaRepository extends JpaRepository<Villa,Long> {
    @Query("SELECT SUM(v.price) FROM Villa v")
    Double getTotalPrice();
    @Query("SELECT AVG(v.meters) FROM Villa v")
    Double getAvgMeters();

    @Query("SELECT v FROM Villa v where v.totalNumberOfHalls= :halls and v.totalNumberOfRooms= :rooms")
    List<Villa> getByTotalNumberOfHallsAndTotalNumberOfRooms(int halls, int rooms);
}
