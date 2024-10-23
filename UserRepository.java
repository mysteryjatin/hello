package com.freelancer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freelancer.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom repository methods
}
