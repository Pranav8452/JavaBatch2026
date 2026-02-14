package box14Encapuslation;

public class Student { // Step-1 Public class

	private String name; // Step -2 Private attribute
	private int rollno;
	private double cgpa;

	// Step-3 public Constructor

	public Student(String name, int rollno, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	// STep-4 public Getters & Setters
	public String getanme() {
		return name;
	}

	public int getarollno() {
		return rollno;
	}

}
