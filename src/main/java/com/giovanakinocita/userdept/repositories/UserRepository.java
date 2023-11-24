package com.giovanakinocita.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanakinocita.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
