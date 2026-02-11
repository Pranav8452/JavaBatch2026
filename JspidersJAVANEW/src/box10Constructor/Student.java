package box10Constructor;

//from chatGPT
class Student {

	int id;
	String name;

	// Default Constructor
	Student() {
		id = 0;
		name = "Unknown";
	}

	// Parameterized Constructor (1 parameter)
	Student(int i) {
		id = i;
		name = "Not Assigned";
	}

	// Parameterized Constructor (2 parameters)
	Student(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println("ID: " + id + " Name: " + name);
	}

	public static void main(String[] args) {

		Student s1 = new Student(); // Calls default constructor
		Student s2 = new Student(101); // Calls 1 parameter constructor
		Student s3 = new Student(102, "Pranav"); // Calls 2 parameter constructor

		s1.display();
		s2.display();
		s3.display();
	}
}
