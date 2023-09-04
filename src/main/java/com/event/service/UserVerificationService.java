
package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserVerificationService {
    
    @Autowired
    private UserRepository userRepository;
    
    public void sendVerificationEmail(User user) {
        // Code to send verification email to user's email address
    }
}
