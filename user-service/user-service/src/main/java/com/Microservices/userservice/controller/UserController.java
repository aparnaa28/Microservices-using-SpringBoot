package com.Microservices.userservice.controller;

import com.Microservices.userservice.VO.ResponseTemplateVO;
import com.Microservices.userservice.entity.UserEntity;
import com.Microservices.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserEntity saveUser(@RequestBody UserEntity user)
    {
        log.info("Inside saveUser of userController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId)
    {
        return userService.getUserWithDepartment(userId);
    }
}
