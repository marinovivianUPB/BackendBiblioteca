package com.upb.admin.app.services;

import com.upb.admin.domain.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    User getById(String id);

    List<User> getAll();

    User deleteById(String id);

    User updateUser(String id, User user);
}
