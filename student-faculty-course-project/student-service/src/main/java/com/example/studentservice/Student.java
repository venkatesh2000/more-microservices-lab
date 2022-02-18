package com.example.studentservice;

public class Student {
    private final int id;
    private final String name;
    private final String usn;

    public Student(final int id, final String name, final String usn) {
        this.id = id;
        this.name = name;
        this.usn = usn;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }
}