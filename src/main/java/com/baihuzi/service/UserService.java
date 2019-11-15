package com.baihuzi.service;

import com.baihuzi.po.User;

public interface UserService {

    User checkUser(String username,String password);
}
