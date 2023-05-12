package com.example.bootcamphw1.repository;

import com.example.bootcamphw1.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHouseRepository extends JpaRepository<House,Long> {
    @Query("SELECT SUM(h.price) FROM House h")
    Double getTotalPrice();
    @Query("SELECT AVG(h.meters) FROM House h")
    Double getAvgMeters();
    @Query("SELECT h FROM House h where h.totalNumberOfHalls= :halls and h.totalNumberOfRooms= :rooms")
    List<House> getByTotalNumberOfHallsAndTotalNumberOfRooms(int halls, int rooms);
}
