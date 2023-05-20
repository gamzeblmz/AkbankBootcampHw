package com.example.bootcamphw2.controller;

import com.example.bootcamphw2.business.abstracts.UserService;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/")
    public  UserResponseDTO save(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO userResponseDTO = userService.save(userRequestDTO);
        return userResponseDTO;
//        return ResponseEntity.ok(userResponseDTO);
    }
}
