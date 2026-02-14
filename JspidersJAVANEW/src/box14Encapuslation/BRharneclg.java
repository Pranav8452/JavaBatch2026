package box14Encapuslation;

public class BRharneclg {
	public static void main(String[] args) {
		Student s1 = new Student("pranav", 123, 7.5);
		Student s2 = new Student("surve", 456, 9.5);
		System.out.println(s1.getname());
		System.out.println(s1.getrollno());
		System.out.println(s2.getcgpa());
		s1.setname("saras");
		System.out.println(s1.getname());
		System.out.println(s1.getcgpa());
		s2.setcgpa(8.5);
		System.out.println(s2.getcgpa());

	}
}
