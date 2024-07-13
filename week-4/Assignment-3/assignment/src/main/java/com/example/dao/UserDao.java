package com.example.dao;

import com.example.proj.User;

public interface UserDao {
    //return User or null
    User getUserById(int id);
    //return User or null
    User getUserByEmail(String email);
    //return String about result
    String setUser(String email, String password);
}
