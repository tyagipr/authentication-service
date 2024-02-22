package com.example.authenticationservice.service;

import com.example.authenticationservice.exception.DuplicateUserException;
import com.example.authenticationservice.model.UserDao;

public interface UserServiceInterface {

    void signUp(UserDao userDao) throws DuplicateUserException;

    void modifyUser(UserDao userDao);

    String loginUser(UserDao userDao);

    UserDao getUser(UserDao userDao);

}
