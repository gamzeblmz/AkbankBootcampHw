package com.example.bootcamphw2.business.concretes;

import com.example.bootcamphw2.business.UserManager;
import com.example.bootcamphw2.business.abstracts.UserService;
import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.mapper.UserMapper;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
   private final UserManager userManager;
    @Override
    public UserResponseDTO save(UserRequestDTO userRequestDTO){
       User user = UserMapper.INSTANCE.converToUser(userRequestDTO);
       user = userManager.save(user);
        return UserMapper.INSTANCE.converToUserResponseDTO(user);
    }
}
