package com.yiran.blog.dao;

import com.yiran.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReponsitory extends JpaRepository<User, Long> {

    public User findByUsernameAndPassword(String username, String password);

}
