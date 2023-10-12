package com.sanmik.sanmikTest.controller;

import com.sanmik.sanmikTest.dto.UserDTO;
import com.sanmik.sanmikTest.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created By kavinda_d on 10/12/2023
 *
 * @AUTHOR : kavinda_d
 * @DATE : 10/12/2023
 * @PROJECT : sanmik
 */

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private com.sanmik.sanmikTest.service.userService userService;

    @GetMapping("getAllUsers")
    public ResponseUtil getAllUsers() {
        return new ResponseUtil(200, "Ok", userService.getAllUsers());
    }

    @PostMapping("saveUser")
    public ResponseUtil saveUser(@RequestBody UserDTO userDTO) {
        return new ResponseUtil(200, "Ok", userService.saveUser(userDTO));
    }

    @DeleteMapping("deleteUser")
    public ResponseUtil deleteUser(@RequestParam("id") int id) {
        System.out.println(id);
        return new ResponseUtil(200, "Ok", userService.deleteUser(id));
    }

}
