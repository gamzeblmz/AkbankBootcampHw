package com.example.bootcamphw2.entitiy;

import com.example.bootcamphw2.general.BaseEntitiy;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product extends BaseEntitiy {
    @Id
    @GeneratedValue(generator = "Product", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    private Long id;
    @Column(name = "DESCRIPTION", length = 400, nullable = false)
    private String desc;
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;
    private double price;
}
