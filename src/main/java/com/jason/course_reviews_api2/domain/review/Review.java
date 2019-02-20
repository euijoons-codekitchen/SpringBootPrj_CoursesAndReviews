package com.jason.course_reviews_api2.domain.review;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.jason.course_reviews_api2.core.BaseEntity;
import com.jason.course_reviews_api2.domain.course.Course;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Review extends BaseEntity {

    private int rating;
    private String description;
    @ManyToOne
    @JsonBackReference
    private Course course;

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    protected Review() {
        super();

    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
