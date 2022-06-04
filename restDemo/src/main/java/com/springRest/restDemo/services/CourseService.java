package com.springRest.restDemo.services;

import java.util.List;

import com.springRest.restDemo.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseID);

	public Course addCourse(Course course);
}
