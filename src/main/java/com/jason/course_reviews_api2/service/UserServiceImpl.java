package com.jason.course_reviews_api2.service;

import com.jason.course_reviews_api2.domain.user.User;
import com.jason.course_reviews_api2.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){

        this.userRepository = userRepository;
    }

    @Override
    public User join(String email, String passwd) {

        User newUser = userRepository.save(new User(email,passwd));
        Optional<User> user = userRepository.findById(newUser.getId());
        user.get().userToString();

        return user.get();

    }

    @Override
    public User login(String email, String passwd) {

        //userRepository.findById();

        return null;
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach((user)->users.add(user));
        return users;
    }
}
