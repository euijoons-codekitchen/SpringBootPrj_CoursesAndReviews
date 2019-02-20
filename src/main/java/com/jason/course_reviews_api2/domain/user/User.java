package com.jason.course_reviews_api2.domain.user;

import com.jason.course_reviews_api2.core.BaseEntity;
import com.jason.course_reviews_api2.domain.course.Course;

import javax.persistence.*;
import java.util.List;

@Table(name = "users")
@Entity
public class User extends BaseEntity {

    @Column(name = "email")
    private String email;

    @Column(name = "passwd")
    private String passwd;
//
    //@OneToMany(mappedBy = "usercourse",cascade = CascadeType.ALL)
    //private List<Course> course;

    protected User(){
        super();
        //course = new ArrayList<>();
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

    public String userToString(){
        return String.format("email : "+email + " passwd : " + passwd);
    }
}
