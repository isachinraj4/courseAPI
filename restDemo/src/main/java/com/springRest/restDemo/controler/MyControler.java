package com.springRest.restDemo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.restDemo.entities.Course;
import com.springRest.restDemo.services.CourseService;

@RestController
public class MyControler {
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to home";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}

//	We use {} in the mapping url to pass the dynamic values to the url
//	We also use @PathVariable to get the url value and then we use a variable to 
	@GetMapping("/courses/{courseID}")
	public Course getCourse(@PathVariable String courseID) {
		return this.courseService.getCourse(Long.parseLong(courseID));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
}
