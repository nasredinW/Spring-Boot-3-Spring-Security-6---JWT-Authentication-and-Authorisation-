package com.lcms.security.service;

import com.lcms.security.Model.User;

import java.util.List;


public interface AccountService {


    /**
     * Admin can add new user to platform
     * @param appUser
     * @return
     */
    User addNewUser(User appUser);




    List<User> listUsers();

    //delete usr
    //update user
    //find user by email
    //find user by name
    //

}
