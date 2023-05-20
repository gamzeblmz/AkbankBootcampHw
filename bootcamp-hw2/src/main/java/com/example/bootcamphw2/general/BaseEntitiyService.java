package com.example.bootcamphw2.general;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * diger servisler tarafindan metotları kullanilacagi ve tes basina bir anlami olmadigi icin abstract olarak
 * tanimlanmalidir.
 */
public abstract class BaseEntitiyService <E extends BaseEntitiy, R extends JpaRepository<E, Long>> {


}
