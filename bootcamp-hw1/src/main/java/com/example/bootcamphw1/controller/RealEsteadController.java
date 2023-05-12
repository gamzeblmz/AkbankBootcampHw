package com.example.bootcamphw1.controller;
import com.example.bootcamphw1.model.HouseDto;
import com.example.bootcamphw1.model.ModelDto;
import com.example.bootcamphw1.services.RealEsteadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class RealEsteadController {

    private final RealEsteadService realEsteadService;

    public RealEsteadController(RealEsteadService realEsteadService) {
        this.realEsteadService = realEsteadService;
    }

    @PostMapping("/house")
    public ResponseEntity<ModelDto> createHouse (@RequestBody ModelDto houseDto){
        return ResponseEntity.ok(realEsteadService.createHouse(houseDto));
    }
    @PostMapping("/villa")
    public ResponseEntity<ModelDto> createVilla (@RequestBody ModelDto villaDto){
        return ResponseEntity.ok(realEsteadService.createVilla(villaDto));
    }
    @PostMapping("/summerH")
    public ResponseEntity<ModelDto> createSummerHouse (@RequestBody ModelDto summeModelDto){
        return ResponseEntity.ok(realEsteadService.createSummerHouse(summeModelDto));
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


}
