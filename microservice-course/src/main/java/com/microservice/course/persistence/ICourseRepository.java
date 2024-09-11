package com.microservice.course.persistence;

import com.microservice.course.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepository extends CrudRepository<Course, Long> {
}
