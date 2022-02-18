package com.example.studentservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/students")
@RestController
public class StudentController {
    private List<Student> students = Arrays.asList(
            new Student(1, "Venkatesh S", "1MS18CS135"),
            new Student(2, "Jaison Pravith D'souza", "1MS18CS141"),
            new Student(3, "Rithvik S", "1MS18CS100"),
            new Student(4, "Tharun E", "1MS18CS127"));
    
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }
    
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                        .filter(student -> student.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}