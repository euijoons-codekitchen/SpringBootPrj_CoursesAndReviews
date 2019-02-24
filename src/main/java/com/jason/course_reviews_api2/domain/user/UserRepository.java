package com.jason.course_reviews_api2.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmailAndPasswd(String email, String passwd);
}
