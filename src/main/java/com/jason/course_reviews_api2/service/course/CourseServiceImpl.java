package com.jason.course_reviews_api2.service.course;

import com.jason.course_reviews_api2.domain.course.Course;
import com.jason.course_reviews_api2.domain.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;
    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();

        courseRepository.findAll().forEach((course -> courses.add(course)));

        return courses;
    }

    @Override
    public List<Course> findCoursesContainingTitle(String title) {
        return courseRepository.findByTitleContaining(title);
    }

    @Override
    public Course findCourseWithTitle(String title) {

        return courseRepository.findByTitle(title);
    }

    @Override
    public Course findCourseById(Long id) {

        return courseRepository.findById(id).get();
    }
}
