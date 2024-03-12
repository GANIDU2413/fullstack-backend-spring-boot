package com.codewithganidu.fullstackbackend.repository;

import com.codewithganidu.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
