package com.example.graphql.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Course(Integer id, String name, Integer moduleCount, Integer lecturerId, Integer studentsId) {
    public static List<Course> courses = Arrays.asList(
            new Course(1, "Computer Systems", 8, 1, 4),
            new Course(2, "Information Systems", 10, 2, 3),
            new Course(3, "Computer Science", 7, 3, 2),
            new Course(4, "Human Resources", 6, 4, 1)
    );

    public static Optional<Course> courseById(Integer courseId) {
        return courses.stream()
                .filter(c ->c.id.equals(courseId))
                .findFirst();
    }
}
