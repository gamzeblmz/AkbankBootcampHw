package com.example.bootcamphw2.business.abstracts;

import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;

import java.util.List;

public interface UserService {
     UserResponseDTO save(UserRequestDTO userRequestDTO);
     List<UserResponseDTO> findAll();
}
