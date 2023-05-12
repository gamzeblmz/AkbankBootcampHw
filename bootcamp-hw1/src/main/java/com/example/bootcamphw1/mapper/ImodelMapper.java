package com.example.bootcamphw1.mapper;

import com.example.bootcamphw1.entities.House;
import com.example.bootcamphw1.entities.SummerHouse;
import com.example.bootcamphw1.entities.Villa;
import com.example.bootcamphw1.model.ModelDTO;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ImodelMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    dto dan entitiy map islemi
    void houseFromDto(ModelDTO dto, @MappingTarget House entity);
//       entitiy den dto ya map islemi
    void houseDtoFromEntity(House entity, @MappingTarget ModelDTO dto);

    void villaFromDto(ModelDTO dto, @MappingTarget Villa entity);
    void villaDtoFromEntity(Villa entity,@MappingTarget ModelDTO dto);

    void summerHouseFromDto(ModelDTO dto, @MappingTarget SummerHouse entity);
    void summerHouseFromEntity(SummerHouse entity,@MappingTarget ModelDTO dto);

}
