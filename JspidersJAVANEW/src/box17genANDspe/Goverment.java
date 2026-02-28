package box17genANDspe;

public class Goverment {

//Generalization Method
	void AadharCard(Person p) {

		System.out.println("Everyone want Aadhar card");
	}

//Specialization Method
	void Scholrship(Student s) {
		System.out.println("Student got Scholrship");
	}

	void TaxPayer(Employee e) {
		System.out.println("Employee Should pay Income tax");
	}
}
