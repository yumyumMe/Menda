package com.app.menda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.menda.Entity.Users;
import com.app.menda.Repository.UserRepository;
import com.app.menda.Response.UserResponse;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        List<Users> users = userRepository.findAll();
        return users;
    }

    public Users getUser(Integer employeeNumber) {
        Optional<Users> opt = userRepository.findById(employeeNumber);

        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }
    
}
