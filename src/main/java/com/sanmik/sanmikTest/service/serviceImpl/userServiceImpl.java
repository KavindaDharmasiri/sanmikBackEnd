package com.sanmik.sanmikTest.service.serviceImpl;

import com.sanmik.sanmikTest.dto.UserDTO;
import com.sanmik.sanmikTest.entity.User;
import com.sanmik.sanmikTest.repository.userRepo;
import com.sanmik.sanmikTest.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By kavinda_d on 10/12/2023
 *
 * @AUTHOR : kavinda_d
 * @DATE : 10/12/2023
 * @PROJECT : sanmik
 */

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userRepo repo;

    @Override
    public List<User> getAllUsers() {
        List<User> all = repo.findAll();
        return all;
    }

    @Override
    public User saveUser(UserDTO userDTO) {
        User user = new User(userDTO.getName(),userDTO.getId(),userDTO.getAddress(),userDTO.getAge(),userDTO.getContact());
        return repo.save(user);
    }

    @Override
    public boolean deleteUser(int id) {
        repo.deleteById(id);
        return true;
    }
}
