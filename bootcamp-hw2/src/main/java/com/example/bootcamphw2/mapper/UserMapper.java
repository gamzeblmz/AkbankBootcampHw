package com.example.bootcamphw2.mapper;

import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User converToUser(UserRequestDTO userRequestDTO);
    UserResponseDTO converToUserResponseDTO (User user);

    List<UserResponseDTO> convertToUserResponseDTOList(List<User> userList);
}
