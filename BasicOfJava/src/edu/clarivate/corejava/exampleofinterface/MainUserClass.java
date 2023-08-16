package edu.clarivate.corejava.exampleofinterface;

public class MainUserClass {

	public static void main(String[] args) {
//		User user = new User();
//		user.setUserName("Raj");
//		user.setEmail("raj@abc.in");
//		user.setPhoneNumber(8736453623l);
//
//		Employee employee = new Employee();
//		employee.setUserName("Ram");
//		employee.setEmail("Ram@abc.in");
//		employee.setPhoneNumber(8726353221l);
//		employee.setDecs("Developer");
//		employee.setSalary(40000.00);
//
//		Student student = new Student();
//		student.setUserName("Prithi");
//		student.setEmail("Prithi@abc.in");
//		student.setPhoneNumber(98233526118l);
//		student.setSubject("JSE");
//		student.setScore(7.9);

		User user1 = new Employee();
		user1.setEmail("Test@abc.in");
		System.out.println(user1.getEmail());

		// Employee employee2 = (Employee) new User();

	}

}
