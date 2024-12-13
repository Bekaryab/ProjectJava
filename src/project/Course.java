package project;

public class Course {
	private String courseID;
	private String name;
	private CourseType type;
	
	public String getCourseID() {
		return courseID;
	}
	
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	public CourseType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
}
