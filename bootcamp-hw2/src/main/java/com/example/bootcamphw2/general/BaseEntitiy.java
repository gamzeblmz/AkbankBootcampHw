package com.example.bootcamphw2.general;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;

/**
 MappedSuperclas anatasyonu sayesinde
 alt sınıfların/entitiylerin bu alanları tablolara eklendi.
 */

/**
 * BaseEntity sinifi, tek basina kullanilabilecek bir islevi olmayan veya
 * yalnizca alt siniflarla birlikte anlam ifade eden
 * bir siniftir. Bu durumda, abstract anahtar kelimesi kullanilarak
 * dogrudan örnekleme engellenmistir.
 */
@MappedSuperclass
@Data
public abstract class BaseEntitiy implements Serializable,BaseEntitiyModel{
    /**
     * embeded anatasyonu BaseEntitiy clasinin
     * BaseEntitiyFields clasindaki alanları kendi
     * alanlarına ekleyebilmesini saglar.
     */
    @Embedded
    private BaseEntitiyFields baseEntitiyFields;

}
