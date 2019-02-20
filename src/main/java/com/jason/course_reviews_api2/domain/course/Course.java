package com.jason.course_reviews_api2.domain.course;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jason.course_reviews_api2.core.BaseEntity;
import com.jason.course_reviews_api2.domain.review.Review;
import com.jason.course_reviews_api2.domain.user.User;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course extends BaseEntity {

    private String title;
    private String url;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews_what;


    @ManyToOne
    @JsonBackReference
    private User usercourse;

    protected Course(){
        super();
        reviews_what = new ArrayList<>();
    }

    public User getUsercourse() {
        return usercourse;
    }

    public void setUsercourse(User usercourse) {
        this.usercourse = usercourse;
    }

    public List<Review> getReviews_what() {
        return reviews_what;
    }

    public void addReview(Review review){
        review.setCourse(this);
        reviews_what.add(review);
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

    public void courseToString(){
        System.out.println("title : "+title+" url : "+url);
    }
}
