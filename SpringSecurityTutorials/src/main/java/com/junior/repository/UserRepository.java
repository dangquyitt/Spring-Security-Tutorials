package com.junior.repository;

import com.junior.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // select * from user where username = :username
    User findByUsername(String username);
}
