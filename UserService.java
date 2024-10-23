package com.freelancer.services;

import java.util.List;

import com.freelancer.models.User;

public interface UserService {
    // Service methods
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void saveUser(User user);
    public void deleteUser(int id);
}