package com.cawe.poemon.service;

import com.cawe.poemon.model.User;
import com.cawe.poemon.repositories.UserRepostory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @InjectMocks
    AuthService authService;

    @Mock
    UserRepostory userRepostory;

    User user;
    User invalidUser;

    Example<User> userExample;
    Example<User> invalidUserExample;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setEmail("valid@mail.com");
        user.setPassword("valid password");

        invalidUser = new User();
        invalidUser.setEmail("invalid@mail.com");
        invalidUser.setPassword("invalid password");

        ExampleMatcher modelMatcher = ExampleMatcher.matching();

        userExample = Example.of(user, modelMatcher);
        invalidUserExample = Example.of(invalidUser, modelMatcher);
    }

    @Test
    @DisplayName("Pass Login With Correct Credentials")
    void passLoginWithCorrectCredentials() {
        Boolean exists = userRepostory.exists(userExample);
        when(exists).thenReturn(Boolean.TRUE);

        HttpStatus httpStatus = authService.VerifyUserCredentials(user);

        assertEquals(Boolean.TRUE, exists);
        assertEquals(HttpStatus.OK, httpStatus);
        verify(userRepostory).exists(userExample);
        verifyNoMoreInteractions(userRepostory);
    }

    @Test
    @DisplayName("Recuse Login With Wrong Credentials")
    void recuseLoginWithCorrectCredentials() {
        var exists = userRepostory.exists(invalidUserExample);
        when(exists).thenReturn(Boolean.TRUE);

        HttpStatus httpStatus = authService.VerifyUserCredentials(invalidUser);

        assertEquals(Boolean.FALSE, exists);
        assertEquals(HttpStatus.UNAUTHORIZED, httpStatus);
        verify(userRepostory).exists(invalidUserExample);
        verifyNoMoreInteractions(userRepostory);
    }

}
