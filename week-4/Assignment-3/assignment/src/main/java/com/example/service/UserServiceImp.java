package com.example.service;

import com.example.dao.UserDao;
import com.example.util.BCryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserDao userDao;

    @Autowired
    BCryptUtil bCryptUtil;

    @Override
    public String query(String email) {
        if (userDao.getUserByEmail(email) != null)
            return "user ID: "+userDao.getUserByEmail(email).getId();
        else
            return "no such user";
    }

    @Override
    public String register(String email, String password) {
        if (userDao.getUserByEmail(email) == null) {
            password = bCryptUtil.HashByBCrypt(password);
            return userDao.setUser(email, password);
        }else
            return "The user already exists";
    }

    @Override
    public String login(String email, String password) {
        if (userDao.getUserByEmail(email) != null){
            String passwordHashed = userDao.getUserByEmail(email).getPassword();
            if(bCryptUtil.checkByBCrypt(password,passwordHashed))
                return "Login successful";
            else
                return "email or password is wrong";
        } else
            return "no such user";
    }

}
