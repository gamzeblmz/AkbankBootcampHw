package com.example.bootcamphw2.general;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

/**
 MappedSuperclas anatasyonu sayesinde
 alt sınıfların/entitiylerin bu alanları tablolara eklendi.
 */
@MappedSuperclass
public class BaseEntitiy implements Serializable {

    /**
     * embeded anatasyonu BaseEntitiy clasinin
     * BaseEntitiyFields clasindaki alanları kendi
     * alanlarına ekleyebilmesini saglar.
     */
    @Embedded
    private BaseEntitiyFields baseEntitiyFields;
}
