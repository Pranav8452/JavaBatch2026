package box17genANDspe;

public class Goverment {

//Generalization Method
	void Aadharcard(Person p) {

		System.out.println(p.name + " Will get Aadharcard");
	}

//Specialization Method
	void Scholrship(Student s) {
		if (s.per >= 60) {
			System.out.println(s.name + " got Scholrship");
		} else {
			System.out.println(s.name + " better luck next time(u want above 60)");
		}
	}

	void TaxPayer(Employee e) {
		if (e.sal * 12 > 1200000) {
			System.out.println(e.name + " you should pay tax");
			System.out.println("Tax payable is " + e.sal * 12 * 0.18 + " rs/- only");
		} else {
			System.out.println(e.name + " tax dene ki zarurat nahi hya");
		}
	}
}
