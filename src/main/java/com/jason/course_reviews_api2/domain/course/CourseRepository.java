package com.jason.course_reviews_api2.domain.course;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


public interface CourseRepository extends JpaRepository<Course, Long> {

    //@RestResource(rel = "title-contains",path = "findByTitle")
    //Page<Course> findByTitleContaining(@Param("title") String title, Pageable pageable);

    List<Course> findByTitleContaining(String title);
    Course findByTitle(String title);

}

