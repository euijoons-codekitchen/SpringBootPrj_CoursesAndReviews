package com.jason.course_reviews_api2.course;


import com.jason.course_reviews_api2.core.BaseEntity;
import com.jason.course_reviews_api2.review.Review;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course extends BaseEntity {

    private String title;
    private String url;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews;

    protected Course(){
        super();
        reviews = new ArrayList<>();
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review){
        review.setCourse(this);
        reviews.add(review);
    }

    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
