package com.amu.chen.keeping.repository;

import com.amu.chen.keeping.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int save(User user);

    int update(User user);

    int deleteById(int id);

    User selectById(int id);

    List<User> selectAll();
}
