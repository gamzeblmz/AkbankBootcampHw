package com.example.bootcamphw1.controller;
import com.example.bootcamphw1.model.ModelDTO;
import com.example.bootcamphw1.services.RealEsteadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class RealEsteadController {

    private final RealEsteadService realEsteadService;

    public RealEsteadController(RealEsteadService realEsteadService) {
        this.realEsteadService = realEsteadService;
    }

    @PostMapping("/house")
    public ResponseEntity<ModelDTO> createHouse (@RequestBody ModelDTO houseDto){
        return ResponseEntity.ok(realEsteadService.createHouse(houseDto));
    }
    @PostMapping("/villa")
    public ResponseEntity<ModelDTO> createVilla (@RequestBody ModelDTO villaDto){
        return ResponseEntity.ok(realEsteadService.createVilla(villaDto));
    }
    @PostMapping("/summerH")
    public ResponseEntity<ModelDTO> createSummerHouse (@RequestBody ModelDTO summeModelDto){
        return ResponseEntity.ok(realEsteadService.createSummerHouse(summeModelDto));
    }
    @GetMapping("/getHouse")
    public ResponseEntity<List<ModelDTO>> getHouseList(){
        return new ResponseEntity<>(realEsteadService.getHouseList(), HttpStatus.OK);
    }
    @GetMapping("/getVilla")
    public ResponseEntity<List<ModelDTO>> getVillaList(){
        return new ResponseEntity<>(realEsteadService.getVillaList(), HttpStatus.OK);
    }
    @GetMapping("/getSummerH")
    public ResponseEntity<List<ModelDTO>> getSummerHList(){
        return new ResponseEntity<>(realEsteadService.getSummerHList(), HttpStatus.OK);
    }

    @GetMapping("/totalPriceOfHouse")
    public Double getTotalHousesPrice(){
        return realEsteadService.getTotalHousesPrice();
    }
    @GetMapping("/totalPriceOfvilla")
    public Double getTotalVillasPrice(){
        return realEsteadService.getTotalVillasPrice();
    }
    @GetMapping("/totalPriceOfShouse")
    public Double getTotalSummerHousesPrice(){
        return realEsteadService.getTotalSummerHousesPrice();
    }
    @GetMapping("/totalPrice")
    public Double getTotalPrice(){
        return realEsteadService.getTotalPrice();
    }

    @GetMapping("/AvgHousesMeter")
    public Double getAvgHousesMeter(){
        return realEsteadService.getAvgHousesMeter();
    }
    @GetMapping("/AvgVillasMeter")
    public Double getAvgVillasMeter(){
        return realEsteadService.getAvgVillasMeter();
    }
    @GetMapping("/AvgSummerHMeter")
    public Double getAvgSummerHousesMeter(){
        return realEsteadService.getAvgSummerHousesMeter();
    }

    @GetMapping("/getAvgMeters")
    public Double getAvgMeter(){
        return realEsteadService.getAvgMeter();
    }

    @GetMapping("/{halls}/{rooms}")
    public ResponseEntity<List<ModelDTO>> getRealEsteadbyRoomAndHall(@PathVariable int halls,@PathVariable int rooms){
        return new ResponseEntity<>(realEsteadService.getRealEsteadbyRoom(halls, rooms),HttpStatus.OK);
    }

}
