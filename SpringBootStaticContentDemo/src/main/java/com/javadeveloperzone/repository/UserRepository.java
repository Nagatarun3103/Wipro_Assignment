package com.javadeveloperzone.repository;

import com.javadeveloperzone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
