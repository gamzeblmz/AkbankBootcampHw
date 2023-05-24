package com.example.bootcamphw2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    Long id;
    String desc;
    double price;
    String name;
}
