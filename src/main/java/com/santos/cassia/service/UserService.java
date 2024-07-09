package com.santos.cassia.service;
import com.santos.cassia.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}