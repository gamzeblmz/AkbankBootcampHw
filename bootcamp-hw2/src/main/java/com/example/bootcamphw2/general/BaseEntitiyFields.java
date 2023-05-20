package com.example.bootcamphw2.general;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

/**
 * embedable anatasyonu bu clasın bilesen oldugunu ve
 * baska bir classın alanlarına gömülebilecegini gösterir.
 */
@Embeddable
public class BaseEntitiyFields {

    private Long createdBy;
    private Long updateBy;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

}
