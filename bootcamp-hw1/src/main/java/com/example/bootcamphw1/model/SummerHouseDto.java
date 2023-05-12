package com.example.bootcamphw1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SummerHouseDto {
    private Long id;
    private float price;
    private float meters;
    private int totalNumberOfHalls;
    private int totalNumberOfRooms;
}
