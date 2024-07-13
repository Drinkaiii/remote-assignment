package com.example.service;

public interface UserService {
    //return String about account or error information
    String query(String email);
    //return String about result
    String register(String email, String password);
    //return String about result
    String login(String email, String password);

    //String logout();
    //String changePassword(String email, String password, String newPassword);
}
