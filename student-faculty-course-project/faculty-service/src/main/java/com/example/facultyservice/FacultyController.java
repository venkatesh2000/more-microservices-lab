package com.example.facultyservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/faculties")
@RestController
public class FacultyController {
    private List<Faculty> faculties = Arrays.asList(
            new Faculty(1, "Geetha J", "Associate Professor"),
            new Faculty(2, "Ganeshayya", "Assitant Professor"));
    
    @GetMapping
    public List<Faculty> getAllFaculties() {
        return faculties;
    }
    
    @GetMapping("/{id}")
    public Faculty getFacultyById(@PathVariable int id) {
        return faculties.stream()
                        .filter(faculty -> faculty.getId() == id)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
}