package com.sanmik.sanmikTest.service;

import com.sanmik.sanmikTest.dto.UserDTO;
import com.sanmik.sanmikTest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userService {
    List<User> getAllUsers();

    User saveUser(UserDTO userDTO);

    boolean deleteUser(int id);
}
