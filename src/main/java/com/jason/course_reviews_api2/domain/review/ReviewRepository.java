package com.jason.course_reviews_api2.domain.review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
