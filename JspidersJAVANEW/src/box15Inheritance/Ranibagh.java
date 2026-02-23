package box15Inheritance;

//Method OverRiding and with Hierarchical Example

class Animal {
	void eat() {
		System.out.println("Animal eat food");
	}

	void sleep() {
		System.out.println("Animal are sleeping");
	}

	void drink() {
		System.out.println("Animal are drinking");
	}

	void sound() {
		System.out.println("Animal make sound");
	}
}

class dog extends Animal {
	void sound() {
		System.out.println("bhaw...bhaw...");
	}
}

public class Ranibagh {
	public static void main(String[] args) {

	}
}
