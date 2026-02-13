package box14Encapuslation;

public class Employee { // Step-1 public class
	private int empid; // Step-2 Private Attribute
	private String name;
	private double sal;
	// Step-3 PUblic Constructor

	public Employee(int empid, String name, double sal) {

		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}

	// Step-4 Public Getters and Setters Method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEmpid() {
		return empid;
	}

}
