package com.jason.course_reviews_api2.domain.user;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {

    User findByEmailAndPasswd(String email, String passwd);
}
