package org.spring.springboot.domain;

/**
 * @program: springboot-learning-example
 * @description:
 * @author: Mr.Wang
 * @create: 2018-07-04 16:27
 **/
public class User {

    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
