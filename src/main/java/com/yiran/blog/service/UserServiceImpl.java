package com.yiran.blog.service;

import com.yiran.blog.dao.UserReponsitory;
import com.yiran.blog.po.User;
import com.yiran.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserReponsitory userReponsitory;

    @Override
    public User checkUser(String username, String password) {
        User user = null;
        try {
            user = userReponsitory.findByUsernameAndPassword(username, MD5Util.code(password));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return user;
    }
}
