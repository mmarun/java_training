package com.example.SpringBApplWithDatabase.Repository;

import com.example.SpringBApplWithDatabase.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseDao extends JpaRepository<Course,Long > {

}
