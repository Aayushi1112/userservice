package com.mycompany.userservice.service;

import com.mycompany.userservice.dto.UserDTO;

import java.util.List;

public interface UserService {

    public UserDTO register(UserDTO userDTO);
    public UserDTO login(UserDTO userDTO);

    public List<UserDTO> getAllUsers();
}
