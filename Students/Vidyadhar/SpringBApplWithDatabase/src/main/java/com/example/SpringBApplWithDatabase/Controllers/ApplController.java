package com.example.SpringBApplWithDatabase.Controllers;


import com.example.SpringBApplWithDatabase.Entity.Course;
import com.example.SpringBApplWithDatabase.Repository.CourseDao;
import com.example.SpringBApplWithDatabase.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ApplController {

@Autowired
private CourseService courseService;

    @RequestMapping("/App")
        public String App()
        {
            return "Hello Welcome ";
        }

      @GetMapping("/courses")
    public List<Course> getCourse()
      {
          return courseService.getCourses() ;
      }

      @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId )
      {
          return courseService.getCourse(Long.parseLong(courseId));
      }

      @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course)
      {
          return courseService.addCourse(course);
      }

      @PutMapping("/courses/{courseId}")
      public Course Update(@RequestBody Course course)
      {
          return courseService.updateCourse(course);
      }

      @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
      {
          try {
              courseService.deleteCourse(Long.parseLong(courseId));
              return new ResponseEntity<>(HttpStatus.OK);
          }
          catch (Exception e)
          {
              return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
          }

      }

}
