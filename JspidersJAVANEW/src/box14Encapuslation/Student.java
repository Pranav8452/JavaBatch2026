package box14Encapuslation;

public class Student { // Step-1 Public class

	private String name; // Step -2 Private attribute
	private final int rollno;
	private double cgpa;

	// Step-3 public Constructor
	public Student(String name, int rollno, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	// STep-4 public Getters & Setters
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getrollno() {
		return rollno;
	}

//	public void setrollno(int rollno) {
//		this.rollno = rollno;
//	}

	public double getcgpa() {
		return cgpa;

	}

	public void setcgpa(double cgpa) {
		this.cgpa = cgpa;
	}

}
