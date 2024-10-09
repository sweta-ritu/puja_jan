package com.travelbnb.repository;

import com.travelbnb.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    //entity variable name
    boolean existsByEmail(String email);//existByEmail is used to check weather the email present or not
    boolean  existsByUsername(String username);

    Optional<AppUser> findByUsername(String username);
}
