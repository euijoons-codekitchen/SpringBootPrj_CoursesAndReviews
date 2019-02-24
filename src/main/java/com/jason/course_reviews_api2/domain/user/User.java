package com.jason.course_reviews_api2.domain.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jason.course_reviews_api2.core.BaseEntity;
import com.jason.course_reviews_api2.domain.course.Course;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "users")
@Entity
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)


public class User extends BaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "passwd")
    private String passwd;
//

    @OneToMany(mappedBy = "usercourse",cascade = CascadeType.ALL)

    private List<Course> courses;

    protected User(){
        super();
        courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        course.setUsercourse(this);
        courses.add(course);
    }


    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public User(String email, String passwd) {
        this();
        this.email = email;
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void userToString(){
        System.out.println("email : "+email+" passwd : "+passwd);
    }
}
