package com.example.bootcamphw1.mapper;

import com.example.bootcamphw1.entities.House;
import com.example.bootcamphw1.entities.SummerHouse;
import com.example.bootcamphw1.entities.Villa;
import com.example.bootcamphw1.model.HouseDto;
import com.example.bootcamphw1.model.ModelDto;
import org.mapstruct.*;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ImodelMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    dto dan entitiy map islemi
    void houseFromDto(ModelDto dto, @MappingTarget House entity);
//       entitiy den dto ya map islemi
    void houseDtoFromEntity(HouseDto entity, @MappingTarget ModelDto dto);

    void villaFromDto(ModelDto dto, @MappingTarget Villa entity);
    void villaDtoFromEntity(Villa entity,@MappingTarget ModelDto dto);

    void summerHouseFromDto(ModelDto dto, @MappingTarget SummerHouse entity);
    void summerHouseFromEntity(SummerHouse entity,@MappingTarget ModelDto dto);

}
