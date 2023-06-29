package com.cawe.poemon.service;

import com.cawe.poemon.model.User;
import com.cawe.poemon.repositories.UserRepostory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    final UserRepostory userRepository;

    public AuthService(UserRepostory userRepository) {
        this.userRepository = userRepository;
    }

    public HttpStatus VerifyUserCredentials(User user) {
        ExampleMatcher modelMatcher = ExampleMatcher.matching();
        Example<User> userExample = Example.of(user, modelMatcher);
        return userRepository.exists(userExample) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
    }
}
