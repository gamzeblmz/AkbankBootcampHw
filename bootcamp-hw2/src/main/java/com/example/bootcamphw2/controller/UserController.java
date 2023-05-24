package com.example.bootcamphw2.controller;

import com.example.bootcamphw2.business.abstracts.UserService;
import com.example.bootcamphw2.general.RestResponse;
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

    @PostMapping("/")
    public  ResponseEntity<RestResponse<UserResponseDTO>> save(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
        return ResponseEntity.ok(RestResponse.of(userResponseDTO));
    }
    @GetMapping("/all")
    public ResponseEntity<RestResponse<List<UserResponseDTO>>> findAll(){
        var userResponseDTOList = userService.findAll();
        return ResponseEntity.ok(RestResponse.of(userResponseDTOList));
    }
    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<UserResponseDTO>>findById(@PathVariable("id") Long id){
        var userResponseDTO= userService.findById(id);
        return ResponseEntity.ok(RestResponse.of(userResponseDTO));
    }

    @GetMapping("/userName/{userName}")
    public ResponseEntity<RestResponse<UserResponseDTO>> findByUserName(@PathVariable("userName") String userName){
        var userResponseDTO= userService.findByUserName(userName);
        return ResponseEntity.ok(RestResponse.of(userResponseDTO));
    }

}
