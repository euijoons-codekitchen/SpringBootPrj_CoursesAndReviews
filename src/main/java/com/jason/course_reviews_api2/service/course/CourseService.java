package com.jason.course_reviews_api2.service.course;

import com.jason.course_reviews_api2.domain.course.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    Course findCourseWithTitle(String title);

    List<Course> findCoursesContainingTitle(String title);

    Course findCourseById(Long id);

}
