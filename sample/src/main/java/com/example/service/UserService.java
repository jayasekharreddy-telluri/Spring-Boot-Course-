package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.UserRequestDTO;
import com.example.dto.UserResponseDTO;
import com.example.entity.User;
import com.example.repo.UserRepository;

@Service
public class UserService {
	
	/*
	 * @Autowired private UserRepository userRepository;
	 */
	 // Create
		/*
		 * public UserResponseDTO createUser(UserRequestDTO userRequestDTO) { User user
		 * = new User(null, null, null, 0); user.setName(userRequestDTO.getName());
		 * user.setEmail(userRequestDTO.getEmail());
		 * user.setAge(userRequestDTO.getAge()); User savedUser =
		 * userRepository.save(user); return mapToResponseDTO(savedUser); }
		 * 
		 * private UserResponseDTO mapToResponseDTO(User user) { // TODO Auto-generated
		 * method stub
		 * 
		 * UserResponseDTO responseDTO = new UserResponseDTO();
		 * responseDTO.setId(user.getId()); responseDTO.setName(user.getName());
		 * responseDTO.setEmail(user.getEmail()); responseDTO.setAge(user.getAge());
		 * return responseDTO;
		 * 
		 * }
		 */



}
