package com.jason.course_reviews_api2.controller;

import com.jason.course_reviews_api2.domain.course.Course;
import com.jason.course_reviews_api2.domain.user.User;
import com.jason.course_reviews_api2.dto.UserCourseDto;
import com.jason.course_reviews_api2.service.course.CourseService;
import com.jason.course_reviews_api2.service.user.UserService;
import com.sun.tools.internal.xjc.model.Model;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/course")
@Controller
public class CourseController {

    private CourseService courseService;
    private UserService userService;
    @Autowired
    public CourseController(CourseService service, UserService userService){
        this.courseService = service;
        this.userService = userService;
    }

    @PostMapping("/addCourse")

    @Transactional
    public @ResponseBody List<Course> addCourse(@RequestBody UserCourseDto dto){


        System.out.println("addCourse");
        Course course = courseService.findCourseById(dto.getCourse_id());
        course.courseToString();
        User user = userService.findUserById(dto.getUser_id());
        System.out.println("응??");
        user.userToString();

        user.addCourse(course);
        userService.updateUser(user);


        return user.getCourses();
    }

    @PostMapping("/myCourses")
    public @ResponseBody List<Course> myCourses(@RequestBody UserCourseDto dto){


        System.out.println("myCourses");
        return userService.findUserById(dto.getCourse_id()).getCourses();


    }
}
