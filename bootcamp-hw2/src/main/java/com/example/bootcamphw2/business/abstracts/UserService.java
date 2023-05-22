package com.example.bootcamphw2.business.abstracts;

import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserService {
     UserResponseDTO save(UserRequestDTO userRequestDTO);
     List<UserResponseDTO> findAll();
     UserResponseDTO findById(Long id);
     UserResponseDTO findByUserName(String userName);

}
