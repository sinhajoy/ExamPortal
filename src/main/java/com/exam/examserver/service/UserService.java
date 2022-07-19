package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

import java.util.Set;

public interface UserService {

    //Create User

    public User createUser(User user, Set<UserRole> userRoles);
}
