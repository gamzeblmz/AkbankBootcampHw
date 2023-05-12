package com.example.bootcamphw1.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "SUMMERYHOUSES")
public class SummerHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private float price;
    private float meters;
    private int totalNumberOfHalls;
    private int totalNumberOfRooms;
}
