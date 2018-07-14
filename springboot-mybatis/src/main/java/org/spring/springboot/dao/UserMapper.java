package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.spring.springboot.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 17:06
 **/
//@Mapper 1.在启动类上面使用MapperScan后直接扫描  后面的mapper上面全都不用写Mapper注解了
public interface UserMapper {

    List<User> getUser();
}
