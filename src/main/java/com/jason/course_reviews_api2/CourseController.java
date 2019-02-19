package com.jason.course_reviews_api2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/com/jason/course_reviews_api2/course")
    public String TestApi() {
        return "Success";
    }
}
