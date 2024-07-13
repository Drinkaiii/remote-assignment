package com.example.util;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BCryptUtil {

    public String HashByBCrypt(String originalPassword) {
        return BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
    }

    public boolean checkByBCrypt(String password, String hashedPassword) {
        boolean passwordVerified = BCrypt.checkpw(password, hashedPassword);
        System.out.println("Password verified: " + passwordVerified);
        return passwordVerified;
    }
}
