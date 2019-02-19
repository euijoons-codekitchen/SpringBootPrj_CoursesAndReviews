package com.jason.course_reviews_api2.course;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

    @RestResource(rel = "title-contains",path = "findByTitle")
    Page<Course> findByTitleContaining(@Param("title") String title, Pageable pageable);
//
//    {
//        _links: {
//            title-contains: {
//                href: "http://localhost:8080/courses/search/findByTitle{?title,page,size,sort}",
//                        templated: true
//            },
//            self: {
//                href: "http://localhost:8080/courses/search/"
//            }
//        }
//    }
}

