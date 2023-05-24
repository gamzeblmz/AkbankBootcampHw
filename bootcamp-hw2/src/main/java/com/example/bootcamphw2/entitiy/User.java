package com.example.bootcamphw2.entitiy;

import com.example.bootcamphw2.enums.UserType;
import com.example.bootcamphw2.general.BaseEntitiy;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
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
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;
    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surName;
    @Column(name = "USERNAME", length = 50, nullable = false, unique = true)
    private String userName;
    @Email
    @Column(name = "EMAIL", length = 50)
    private String email;

    @NotNull
    @Column(name = "PASSWORD", length = 400, nullable = false)
    private String password;

    private String phoneNo;
    private UserType userType;

}
