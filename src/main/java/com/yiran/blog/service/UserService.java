package com.yiran.blog.service;

import com.yiran.blog.po.User;

public interface UserService {

    User checkUser(String name, String password);
}
