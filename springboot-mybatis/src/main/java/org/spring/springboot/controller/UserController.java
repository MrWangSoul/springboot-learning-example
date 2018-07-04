package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 17:08
 **/
@RestController
@RequestMapping("springboot")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("getUser")
    public List<User> getUser() {
        return service.getUser();
    }

}
