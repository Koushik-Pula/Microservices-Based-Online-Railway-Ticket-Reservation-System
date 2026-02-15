package com.railway.user_service.service;

import com.railway.user_service.model.User;

public interface UserService{
    User registerUser(User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    User login(String email, String password);

    void changePassword(Long userId, String oldPassword, String newPassword);
}