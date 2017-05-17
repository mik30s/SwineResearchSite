package com.tarleton.edu.Services;

import com.tarleton.edu.DataAccessors.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao user;

    public String login(){
        return "you logged in.";
    }
}
