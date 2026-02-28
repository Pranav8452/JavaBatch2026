package box17genANDspe;

public class Election {
	public static void main(String[] args) {
		Person p1 = new Person("Pranav", 22, 'm');
		Student s1 = new Student("bushan", 20, 'M', 43, 73.75, "BRHCE");
		Employee e1 = new Employee("Abhijit", 25, 'M', 800, 1200000, "Developer");

		Goverment g1 = new Goverment();
		g1.Aadharcard(p1);
		g1.Scholrship(s1);
		g1.TaxPayer(e1);
	}
}
