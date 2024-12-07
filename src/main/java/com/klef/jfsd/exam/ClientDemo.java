package com.klef.jfsd.exam;

import java.util.Arrays;

import org.springframework.beans.annotaions.Autowired;

import com.klef.jfsd.exam.model.Course;
import com.klef.jfsd.exam.model.Employee;
import com.klef.jfsd.exam.model.Instructor;

public class ClientDemo {
	
	@Autowired
	private Instructor instructor;
	
	
	public static void main(String[] args) {
		Course course = new Course();
		course.setCourseId(1);
		course.setCourseName("JFSD");
		course.setCredits(2);
		
		instructor.setInstructorId(1);
		instructor.setName("JSK");
		instructor.setEmail("jsk@email.com");
		instructor.setPhone("1234567890");
		
		course.setInstructor(instructor);
		
		Employee emp = new Employee(
				1,
				"name",
				50000,
				"department",
				Arrays.asList(new String[] {"skill1", "skill2"})
			);
		
		System.out.println("Courses:");
		System.out.println(course);
		
		System.out.println("Employee:");
		System.out.println(emp);
	}

}
