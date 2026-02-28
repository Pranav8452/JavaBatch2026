package box17genANDspe;

public class Election {
	public static void main(String[] args) {
		Person p1 = new Person("Pranav", 22, 'm');
		Person p2 = new Person("Saras", 22, 'm');
		Student s1 = new Student("sahil", 22, 'M', 43, 59.75, "BRHCE");
		Student s2 = new Student("Siddhant", 22, 'M', 43, 73.75, "BRHCE");
		Employee e1 = new Employee("Abhijit", 25, 'M', 800, 50000, "Developer");
		Employee e2 = new Employee("Saish", 25, 'M', 800, 1200000, "Developer");

		Goverment g1 = new Goverment();
		g1.Aadharcard(p1);
		System.out.println("--------------------");
		g1.Scholrship(s1);
		System.out.println("--------------------");
		g1.TaxPayer(e1);
		System.out.println("----------------------");
		g1.Aadharcard(p2);
		System.out.println("----------------------");
		g1.Scholrship(s2);
		System.out.println("----------------------");
		g1.TaxPayer(e2);
	}
}
