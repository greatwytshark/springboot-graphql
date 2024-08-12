package com.example.graphql.students;

import com.example.graphql.course.Course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Students(Integer id, Integer studentCount) {
    public static List<Students> students = Arrays.asList(
            new Students(1, 20),
            new Students(2, 23),
            new Students(3, 28),
            new Students(4, 30)
    );

    public static Optional<Students> getStudentCountById(Integer studentsId) {
        return students.stream()
                .filter(c ->c.id.equals(studentsId))
                .findFirst();
    }
}
