package project;

public class TechSupporter extends Employee{
	private String task;
	
	
	public TechSupporter (String id, String name, String position, String email, String task) {
		super(id, name, position, email);
		this.task = task;
	}
	
	public void performTask() {
		System.out.println("Performing task:" + task);
	}

}
