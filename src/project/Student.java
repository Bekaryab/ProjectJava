package project;

import java.util.ArrayList;
import java.util.List;

public class Student extends Course{
	private String id;
	private String name;
	private double gpa;
	public List<Course> courses;
	
	
	public Student(String id, String name, double gpa, List<Course> courses){
		this.id  = id;
		this.name = name;
		this.gpa = gpa;
		this.courses =  new ArrayList<>();
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa() {
		this.gpa = gpa;
	}
	
	public void registerForCourses(Course course) {
		courses.add(course);
		System.out.println("Registered for course: " + course.getName());
	}
	
	public void viewTranscript() {
		System.out.println("Transcript for student " + name + ":");
		for(Course course : courses) {
			System.out.println(" - " + course.getName());
		}
		System.out.println("GPA:" + gpa);
	}
	

}
