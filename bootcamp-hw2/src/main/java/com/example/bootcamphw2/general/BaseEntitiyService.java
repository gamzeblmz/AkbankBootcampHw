package com.example.bootcamphw2.general;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * diger servisler tarafindan metotları kullanilacagi ve tes basina bir anlami olmadigi icin abstract olarak
 * tanimlanmalidir.
 */

@Service
@RequiredArgsConstructor
public abstract class BaseEntitiyService <E extends BaseEntitiy, R extends JpaRepository<E, Long>> {

    private  final R repository;

    public E save(E entity){

        BaseEntitiyFields baseEntitiyFields = entity.getBaseEntitiyFields();

        /**
         *   entitiye ait save islemi yapilmis mi?
         *   eger yapilmamissa yeni baseEntitiy field alanları olusturulmali
         */
        if(entity.getBaseEntitiyFields() == null){
             baseEntitiyFields = new BaseEntitiyFields();
             entity.setBaseEntitiyFields(baseEntitiyFields);
        }
         if (entity.getId() ==null){
             entity.getBaseEntitiyFields().setCreatedDate(LocalDateTime.now());
         }
         entity.getBaseEntitiyFields().setUpdateDate(LocalDateTime.now());

         //TODO: JWT entegre et

        entity.setBaseEntitiyFields(baseEntitiyFields);
        entity = repository.save(entity);
        return entity;
    }

    /**
     * servislerdeki ortak islemler eklendi.
     */

    public List<E> findAll(){
        return repository.findAll();
    }

}
