package box12FinalVariable;

/*INTERVIEW QN:- WAJP to create unique employees id's for the employees of JPmorgan company 
- Create 5 to 7 object of employees and print the details*/
class employee {
	String name;
	final String empid;
	double sal;

	private static int randomnum = 700; // IMPORTANT FOR UNDERSTANDING CONCEPT-1

	// Constructor

	public employee(String name, double sal) {

		this.name = name;
		this.empid = "JPm" + randomnum++;// IMPORTANT FOR UNDERSTANDING CONCEPT-2
		this.sal = sal;
	}

	void info() {

		System.out.println(" Employee name is " + name + " Empid is " + empid + " salary is " + sal);
	}
}

public class JPmorgan {
	public static void main(String[] args) {
		employee e1 = new employee("pranv", 80000);
		employee e2 = new employee("saras", 85000);
		employee e3 = new employee("surve", 90000);
		employee e4 = new employee("singh", 50000);
		employee e5 = new employee("sidhu", 100000);
		employee e6 = new employee("saish", 40000);
		employee e7 = new employee("sahil", 300000);
		employee e8 = new employee("omkar", 60000);

		e1.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		e6.info();
		e7.info();
		e8.info();

	}
}
