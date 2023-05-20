package com.example.bootcamphw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelDTO {
    private Long id;
    private float price;

    private float meters;
    private int totalNumberOfHalls;
    private int totalNumberOfRooms;
}
