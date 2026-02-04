package box9Object;
//Create an Entity(class) called as Thar declared 3 attributes (Variables)

//and create a method to print the variables 
// Create another Entity(class) called as Mahindra 
// Create 2 objects of thar in mahindra class and print the details

class Thar {
	String color = "black"; // non-static global variable
	double price = 20;
	int speed = 350;

	void info() { // non-static method
		System.out.println("Thar color is " + color);
		System.out.println("Thar price is " + price);
		System.out.println("Thar speed is " + speed);
	}
}

public class Mahindra {
	public static void main(String[] args) {

		System.out.println("Manufacturing Strat");

		Thar t1 = new Thar(); // Object 1
		System.out.println(t1);
		System.out.println(t1.color);// This is new way to accessing one class in another class
		System.out.println(t1.price);// -||-
		System.out.println(t1.speed);// -||-
//		System.out.println(new Thar().color); // old way is new Thar().color
//		System.out.println(new Thar().price); // old way is new Thar().price
//		System.out.println(new Thar().speed); // old way is new Thar().speed
		System.out.println("-------------------------");
		Thar t2 = new Thar(); // object 2
		System.out.println(t2);
		System.out.println("-------------------------");
		// new Thar().info();
		t1.color = "blue"; // change in object 1
		t2.speed = 400; // change in object 2
		t1.info();
		t2.info();

		System.out.println("Manufacturing End");
	}
}
