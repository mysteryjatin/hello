package com.freelancer.dao;

import org.springframework.stereotype.Repository;

import com.freelancer.models.User;

@Repository
public interface UserDao {

    void save(User users);
}

