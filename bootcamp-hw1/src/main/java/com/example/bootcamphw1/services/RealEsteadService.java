package com.example.bootcamphw1.services;

import com.example.bootcamphw1.entities.House;
import com.example.bootcamphw1.entities.SummerHouse;
import com.example.bootcamphw1.entities.Villa;
import com.example.bootcamphw1.mapper.ImodelMapper;
import com.example.bootcamphw1.model.ModelDTO;

import com.example.bootcamphw1.repository.IHouseRepository;
import com.example.bootcamphw1.repository.ISummerHouseRepository;
import com.example.bootcamphw1.repository.IVillaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

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

    public ModelDTO createHouse(ModelDTO houseDto){
        House house = new House();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.houseFromDto(houseDto,house);
        houseRepository.save(house);
        return houseDto;
    }
    public ModelDTO createVilla(ModelDTO villaDTO){
        Villa villa = new Villa();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.villaFromDto(villaDTO,villa);
        villaRepository.save(villa);
        return villaDTO;
    }
    public ModelDTO createSummerHouse(ModelDTO summerHouseDto){
        SummerHouse summerHouse = new SummerHouse();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        imodelMapper.summerHouseFromDto(summerHouseDto,summerHouse);
        summerHouseRepository.save(summerHouse);
        return summerHouseDto;
    }
    public List<ModelDTO> getHouseList(){
        List<House> houseList = houseRepository.findAll();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        if(houseList!= null){
            List<ModelDTO> modelDTOS = new ArrayList<>();
            for (House house:houseList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.houseDtoFromEntity(house,modelDTO);
                modelDTOS.add(modelDTO);
            }
            return modelDTOS;
        }else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
    }
    public List<ModelDTO> getVillaList(){
        List<Villa> villaList = villaRepository.findAll();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        if(villaList!= null){
            List<ModelDTO> modelDTOS = new ArrayList<>();
            for (Villa villa:villaList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.villaDtoFromEntity(villa,modelDTO);
                modelDTOS.add(modelDTO);
            }
            return modelDTOS;
        }else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
    }
    public List<ModelDTO> getSummerHList(){
        List<SummerHouse> summerHouseList = summerHouseRepository.findAll();
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        if(summerHouseList!= null){
            List<ModelDTO> modelDTOS = new ArrayList<>();
            for (SummerHouse shouse:summerHouseList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.summerHouseFromEntity(shouse,modelDTO);
                modelDTOS.add(modelDTO);
            }
            return modelDTOS;
        }else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found");
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

    public Double getTotalPrice() {
        Double totalPrice = summerHouseRepository.getTotalPrice();
        totalPrice += villaRepository.getTotalPrice();
        totalPrice += houseRepository.getTotalPrice();
        return totalPrice;
    }
    public Double getAvgHousesMeter() {
        return houseRepository.getAvgMeters();
    }

    public Double getAvgVillasMeter() {
        return villaRepository.getAvgMeters();
    }

    public Double getAvgSummerHousesMeter() {
        return summerHouseRepository.getAvgMeters();
    }

    public Double getAvgMeter() {
        Double totalAvgMeter = summerHouseRepository.getAvgMeters();
        totalAvgMeter += villaRepository.getAvgMeters();
        totalAvgMeter += houseRepository.getAvgMeters();
        return totalAvgMeter/3;
    }

    public List<ModelDTO> getRealEsteadbyRoom(int halls,int rooms){
        List<SummerHouse> summerHouseList = summerHouseRepository.getByTotalNumberOfHallsAndTotalNumberOfRooms(halls,rooms);
        List<House> houseList = houseRepository.getByTotalNumberOfHallsAndTotalNumberOfRooms(halls,rooms);
        List<Villa> villaList = villaRepository.getByTotalNumberOfHallsAndTotalNumberOfRooms(halls,rooms);
        this.imodelMapper = Mappers.getMapper(ImodelMapper.class);
        List<ModelDTO> modelDTOS = new ArrayList<>();
        if(summerHouseList!= null){
            for (SummerHouse shouse:summerHouseList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.summerHouseFromEntity(shouse,modelDTO);
                modelDTOS.add(modelDTO);
            }
        }
        if(houseList!= null){
            for (House house:houseList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.houseDtoFromEntity(house,modelDTO);
                modelDTOS.add(modelDTO);
            }
        }
        if(villaList!= null){
            for (Villa villa:villaList){
                ModelDTO modelDTO = new ModelDTO();
                imodelMapper.villaDtoFromEntity(villa,modelDTO);
                modelDTOS.add(modelDTO);
            }
        }
        return modelDTOS;
    }

}
