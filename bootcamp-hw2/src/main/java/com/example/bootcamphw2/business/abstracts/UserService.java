package com.example.bootcamphw2.business.abstracts;

import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;

public interface UserService {
     UserResponseDTO save(UserRequestDTO userRequestDTO);
}
