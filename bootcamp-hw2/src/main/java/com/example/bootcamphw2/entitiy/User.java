package com.example.bootcamphw2.entitiy;

import com.example.bootcamphw2.enums.UserType;
import com.example.bootcamphw2.general.BaseEntitiy;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User extends BaseEntitiy {
    @Id
    @GeneratedValue(generator = "User", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    private Long id;
    private String name;
    private String surName;
    private String userName;
    private String email;
    private String phoneNo;
    private UserType userType;

}
