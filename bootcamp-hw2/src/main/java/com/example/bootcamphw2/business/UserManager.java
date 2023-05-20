package com.example.bootcamphw2.business;

import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.general.BaseEntitiyService;
import com.example.bootcamphw2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserManager extends BaseEntitiyService<User, UserRepository> {
    public UserManager(UserRepository repository) {
        super(repository);
    }
}
