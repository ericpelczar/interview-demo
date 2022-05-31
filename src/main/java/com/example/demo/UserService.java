package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * Demo service.
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepo;

    // TODO: create a method to satisfy the greet operation
}
