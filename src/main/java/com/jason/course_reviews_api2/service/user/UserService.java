package com.jason.course_reviews_api2.service.user;

import com.jason.course_reviews_api2.domain.course.Course;
import com.jason.course_reviews_api2.domain.user.User;

import java.util.List;

public interface UserService {

    User join(String email, String passwd);
    User login(String email, String passwd);

    List<User> getAllUser();

    User findUserById(Long id);

    void updateUser(User user);


}
