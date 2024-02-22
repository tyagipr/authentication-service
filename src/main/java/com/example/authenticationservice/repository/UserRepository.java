package com.example.authenticationservice.repository;

import com.example.authenticationservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = "SELECT * FROM users where user_name=:userName", nativeQuery = true)
    UserEntity findByUserName(String userName);

    @Modifying
    @Transactional
    @Query("UPDATE UserEntity SET password=:password WHERE userName = :userName")
    void updateNewPassword(String password, String userName);
}
