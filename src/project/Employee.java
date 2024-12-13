package project;

public class Employee {
	private String id;
	private String name;
	private String position;
	private String email;
	
	public Employee(String id, String name, String position, String email) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.email = email;
	}
	
	public void sendMessenge(String message) {
		System.out.println("Message send:" + message);
	}
	
	public String readMessage() {
		return "Reading message";
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
}
