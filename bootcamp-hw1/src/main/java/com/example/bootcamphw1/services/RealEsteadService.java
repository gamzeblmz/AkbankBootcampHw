package com.example.bootcamphw1.services;

import com.example.bootcamphw1.entities.House;
import com.example.bootcamphw1.entities.SummerHouse;
import com.example.bootcamphw1.entities.Villa;
import com.example.bootcamphw1.mapper.ImodelMapper;
import com.example.bootcamphw1.model.ModelDto;

import com.example.bootcamphw1.repository.IHouseRepository;
import com.example.bootcamphw1.repository.ISummerHouseRepository;
import com.example.bootcamphw1.repository.IVillaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class RealEsteadService {
    @Autowired
    private IHouseRepository houseRepository;
    @Autowired
    private IVillaRepository villaRepository;
    @Autowired
    private ISummerHouseRepository summerHouseRepository;

    private ImodelMapper imodelMapper;

    public ModelDto createHouse(ModelDto houseDto){
        House house = new House();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.houseFromDto(houseDto,house);
        houseRepository.save(house);
        return houseDto;
    }
    public ModelDto createVilla(ModelDto villaDTO){
        Villa villa = new Villa();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.villaFromDto(villaDTO,villa);
        villaRepository.save(villa);
        return villaDTO;
    }
    public ModelDto createSummerHouse(ModelDto summerHouseDto){
        SummerHouse summerHouse = new SummerHouse();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.summerHouseFromDto(summerHouseDto,summerHouse);
        summerHouseRepository.save(summerHouse);
        return summerHouseDto;
    }

    public Double getTotalHousesPrice(){
        return houseRepository.getTotalPrice();
    }

    public Double getTotalVillasPrice() {
        return villaRepository.getTotalPrice();
    }

    public Double getTotalSummerHousesPrice() {
        return summerHouseRepository.getTotalPrice();
    }
}
