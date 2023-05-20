package com.example.bootcamphw2.model;

import com.example.bootcamphw2.enums.UserType;
import lombok.Data;

@Data
public class UserRequestDTO {
    String name;
    String surName;
    String userName;
    String email;
    String phoneNo;
   UserType userType;
}
