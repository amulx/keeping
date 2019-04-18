package com.amu.chen.keeping.service.impl;

import com.amu.chen.keeping.entity.User;
import com.amu.chen.keeping.repository.UserRepository;
import com.amu.chen.keeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public User getById(Long id){
        return userRepository.getOne(id);
    }

    public User getByUserName(String username){
        return userRepository.findUserByUsername(username);
    }

    public List<User> queryAll(){
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
