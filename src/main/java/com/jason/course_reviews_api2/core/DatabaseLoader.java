package com.jason.course_reviews_api2.core;

import com.jason.course_reviews_api2.domain.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {

    private final CourseRepository courseRepository;

    @Autowired
    public DatabaseLoader(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Course course = new Course("Java Basics","http://teamtreehouse.com");
//        course.addReview(new Review(3,"You are dick"));

//
//
//        courseRepository.save(course);
//        String[] templates = {
//                "%s Basics",
//                "%s For Beginners",
//                "Up and Running with %s"
//        };
//
//        String[] buzzwords = {
//                "Java 9",
//                "Spring REST",
//                "Scala",
//                "Groovy",
//                "Hibernate"
//
//        };
//
//        List<Course> bunchOfCourses = new ArrayList<>();
//
//
//        IntStream.range(0,100)
//                .forEach((i)->{
//                    String template = templates[i%templates.length];
//                    String buzzword = buzzwords[i%buzzwords.length];
//                    String title = String.format(template,buzzword);
//                    Course c = new Course(title,"http://teamtreehouse.com");
//                    c.addReview(new Review(i%5, String.format("%s Moar Please",buzzword)));
//                    bunchOfCourses.add(c);
//                });
//
//        courseRepository.saveAll(bunchOfCourses);

    }
}
