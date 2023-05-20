package com.example.bootcamphw2.repository;

import com.example.bootcamphw2.entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long> {
}
