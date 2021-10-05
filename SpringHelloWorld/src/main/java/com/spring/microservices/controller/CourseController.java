package com.spring.microservices.controller;

import com.spring.microservices.entity.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    //http://localhost:8080/example/course
    @GetMapping("/example/course")
    public String getCourse() {
        return "My First Course...";
    }

    //http://localhost:8080/example/courses
    @GetMapping("/example/courses")
    public List<Course> getCourses(){
        return Arrays.asList(
                new Course("100", "course1", "author1"),
                new Course("101", "course2", "author2"),
                new Course("102", "course3", "author3")
        );
    }
}
