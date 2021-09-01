package com.example.SpringBApplWithDatabase.Services;

import com.example.SpringBApplWithDatabase.Entity.Course;
import com.example.SpringBApplWithDatabase.Repository.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
       Course entity= courseDao.getById(courseId);
       courseDao.delete(entity);
    }

}
