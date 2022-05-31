package com.example.demo;

import static java.util.Objects.requireNonNull;

import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserRepository {

    /**
     * Stubbed method just verifies an ID was passed and always returns the
     * same user.
     */
    public User getUser(Long userId) {
        requireNonNull(userId);
        return new User(123456L, "Mr. Smith");
    }
}
