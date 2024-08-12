package com.example.graphql.course;

import com.example.graphql.lecturer.Lecturer;
import com.example.graphql.students.Students;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class CourseController {
    @QueryMapping
    public List<Course> courses(){
        return Course.courses;
    }

    @QueryMapping
    public Optional<Course> courseById(@Argument Integer courseId){
        return Course.courseById(courseId);
    }

    @SchemaMapping
    public Optional<Lecturer> lecturer(Course course){
        return Lecturer.getLecturerById(course.lecturerId());
    }

    @SchemaMapping
    public Optional<Students> students(Course course){
        return Students.getStudentCountById(course.studentsId());
    }
}
