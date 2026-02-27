package box17genANDspe;

//Sub class 
//6 variable
//1 method
public class Student extends Person {
	int rollno;
	double per;
	String college;

	public Student(String name, int age, char gen, int rollno, double per, String college) {
		super(name, age, gen);
		this.rollno = rollno;
		this.per = per;
		this.college = college;
	}

	@Override
	void info() {
		System.out.println("Student name is " + name + "Age is" + age + "Gender is " + gen + "Roll no is" + rollno
				+ "percenage is " + per + "College is " + college);
	}
}
