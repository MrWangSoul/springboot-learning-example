package org.spring.springboot.dao;

import org.spring.springboot.domain.User;

import java.util.List;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 17:06
 **/
public interface UserMapper {

    List<User> getUser();
}
