package com.example.courseservice;

public class Course {
    private final int id;
    private final String name;
    private final int facultyId;
    private final int studentId;

    public Course(final int id, final String name, final int facultyId, final int studentId) {
        this.id = id;
        this.name = name;
        this.facultyId = facultyId;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public int getStudentId() {
        return studentId;
    }
}