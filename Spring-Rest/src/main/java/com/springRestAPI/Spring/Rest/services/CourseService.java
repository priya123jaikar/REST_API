package com.springRestAPI.Spring.Rest.services;

import com.springRestAPI.Spring.Rest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public  Course getCourse(long courseId);
    public  Course addCourse(Course course);
    public  Course updateCourse(Course course);
    public void  deleteCourse(long parseLong);
}
