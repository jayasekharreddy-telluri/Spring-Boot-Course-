package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.dto.UserRequestDTO;
import com.example.dto.UserResponseDTO;
import com.example.entity.User;
import com.example.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create
	/*
	 * @PostMapping public ResponseEntity<UserResponseDTO> createUser(@RequestBody
	 * UserRequestDTO userRequestDTO) { UserResponseDTO responseDTO =
	 * userService.createUser(userRequestDTO); return new
	 * ResponseEntity<>(responseDTO, HttpStatus.CREATED); }
	 */
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        return ResponseEntity.ok("User created successfully");
    }
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        // For demo purposes, returning a static user
        return new User(id, "John Doe", "john.doe@example.com", 30);
    }
}
