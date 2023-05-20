package com.example.bootcamphw2.controller;

import com.example.bootcamphw2.business.abstracts.UserService;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
  //TODO:RESTRESPONSE İSLEMİ???
    @PostMapping("/")
    public  ResponseEntity<UserResponseDTO> save(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
        return ResponseEntity.ok(userResponseDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserResponseDTO>> findAll(){
        var userResponseDTOList = userService.findAll();
        return ResponseEntity.ok(userResponseDTOList);
    }

}
