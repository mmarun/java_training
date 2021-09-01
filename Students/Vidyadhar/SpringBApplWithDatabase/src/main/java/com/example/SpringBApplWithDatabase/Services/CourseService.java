package com.example.SpringBApplWithDatabase.Services;

import com.example.SpringBApplWithDatabase.Entity.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseService {

    List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);
}
