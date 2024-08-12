package com.example.graphql.lecturer;

import com.example.graphql.course.Course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Lecturer(Integer id, String name) {
    public static List<Lecturer> lecturers = Arrays.asList(
            new Lecturer(1, "Edmand Siziba"),
            new Lecturer(2, "Simba Shava"),
            new Lecturer(3, "Raymond Dube"),
            new Lecturer(4, "Joseph Hove")
    );
    public static Optional<Lecturer> getLecturerById(Integer lecturerId) {
        return lecturers.stream()
                .filter(c ->c.id.equals(lecturerId))
                .findFirst();
    }
}
