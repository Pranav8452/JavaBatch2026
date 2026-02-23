package box15Inheritance;

//Method OverRiding and with Hierarchical Example

class Animal { // Method Overriding
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
	@Override
	void sound() {
		System.out.println("bhaw...bhaw...");
	}
}

class cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow...Meow...");
	}
}

class snake extends Animal {
	@Override
	void sound() {
		System.out.println("sss...sss...");
	}
}

public class Ranibagh {
	public static void main(String[] args) {
		Animal a1 = new dog();// UPcasting
		a1.sound();
		a1.eat();
		a1.sleep();
		a1.drink();

		System.out.println("-------------");
		Animal a2 = new cat();// UPcasting
		a2.sound();
		a2.eat();
		a2.sleep();
		a2.drink();
		System.out.println("-------------");
		Animal a3 = new snake();// UPcasting
		a3.sound();
		a3.eat();
		a3.sleep();
		a3.drink();

	}
}
