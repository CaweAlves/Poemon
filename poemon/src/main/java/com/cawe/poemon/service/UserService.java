package com.cawe.poemon.service;

import com.cawe.poemon.model.User;
import com.cawe.poemon.repositories.UserRepostory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final UserRepostory userRepository;

    public UserService(UserRepostory userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
