package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserMapper;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 17:07
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getUser() {
        return mapper.getUser();
    }
}
