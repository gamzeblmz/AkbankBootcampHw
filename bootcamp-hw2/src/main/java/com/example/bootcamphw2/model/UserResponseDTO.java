package com.example.bootcamphw2.model;

import com.example.bootcamphw2.enums.UserType;
import lombok.Data;
@Data
public class UserResponseDTO {
    Long id;
    String name;
    String SurName;
    String userName;
    String email;
    String phoneNo;
    UserType userType;
}
