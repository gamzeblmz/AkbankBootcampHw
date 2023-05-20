package com.example.bootcamphw2.business;

import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.general.BaseEntitiyService;
import com.example.bootcamphw2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserManager extends BaseEntitiyService<User, UserRepository> {
    private UserRepository userRepository;
    public UserManager(UserRepository repository) {
        super(repository);
        this.userRepository=repository;
    }
    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
    public User findUserByPhoneNo(String phoneNo){
        return userRepository.findUserByPhoneNo(phoneNo);
    }
    public User findUserByUserName(String phoneNo){
        return userRepository.findUserByUserName(phoneNo);
    }
}
