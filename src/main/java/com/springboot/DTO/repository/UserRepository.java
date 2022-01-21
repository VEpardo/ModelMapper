package com.springboot.DTO.repository;

import com.springboot.DTO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
