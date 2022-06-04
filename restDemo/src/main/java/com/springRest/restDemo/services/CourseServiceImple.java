package com.springRest.restDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springRest.restDemo.entities.Course;

@Service
public class CourseServiceImple implements CourseService {

	List<Course> list;
	

	public CourseServiceImple() {
		list = new ArrayList<Course>();
		list.add(new Course(14, "Java Core", "This is Java core course"));
		list.add(new Course(16, "Spring Core", "This is Spring core course"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseID) {
		Course c = null;
		for (Course course : list) {
			if(course.getId()==courseID) {
				c = course;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);		
		return course;
	}

}
