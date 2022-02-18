package com.example.facultyservice;

public class Faculty {
    private final int id;
    private final String name;
    private final String title;

    public Faculty(final int id, final String name, final String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}