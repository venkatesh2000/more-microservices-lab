package com.example.courseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/courses")
@RestController
public class CourseController {
    private final List<Course> courses = Arrays.asList(
            new Course(1, "Microservices Lab", 1, 1),
            new Course(1, "Microservices Lab", 1, 2),
            new Course(1, "Microservices Lab", 1, 3),
            new Course(1, "Microservices Lab", 1, 4),
            new Course(1, "Big Data Lab", 2, 3),
            new Course(1, "Big Data Lab", 2, 5));

    @GetMapping
    public List<Course> getAllCourses() {
        return courses;
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return courses.stream()
                     .filter(order -> order.getId() == id)
                     .findFirst()
                     .orElseThrow(IllegalArgumentException::new);
    }
}