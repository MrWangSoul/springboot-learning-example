package org.spring.springboot.service;

import org.spring.springboot.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 17:06
 **/
public interface UserService {

    List<User> getUser();

}
