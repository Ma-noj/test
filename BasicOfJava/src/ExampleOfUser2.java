import java.util.Scanner;

public class ExampleOfUser2 {
	String userName;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ExampleOfUser2 user1 = new ExampleOfUser2();
		System.out.println("Enter the User1 Name");
		user1.userName = read.nextLine();
		System.out.println("User1 Name =  " + user1.userName);

		ExampleOfUser2 user2 = new ExampleOfUser2();
		System.out.println("Enter the User2 Name");
		user2.userName = read.nextLine();
		System.out.println("User2 Name =  " + user2.userName);

		System.out.println("User1 name = " + user1.userName + "  User2 name = " + user2.userName);
	}

}
