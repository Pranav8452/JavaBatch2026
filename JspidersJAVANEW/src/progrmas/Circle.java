package progrmas;

//method
class Circle {

	static void findArea(double radius) {

		double area = Math.PI * radius * radius;

		System.out.println("Area of Circle is: " + area);
	}

	public static void main(String[] args) {

		findArea(5); // Direct method call (no object needed)
	}
}