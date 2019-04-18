package com.amu.chen.keeping.service;

import com.amu.chen.keeping.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User updateUser(User user);

    User getById(Long id);

    User getByUserName(String usernmae);

    List<User> queryAll();

    void deleteById(Long id);
}
