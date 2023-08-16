import java.util.Scanner;

public class ExampleOfUser {

	static String userName;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the User Name");
		userName = read.nextLine();
		System.out.println("User Name =  " + userName);
		
		System.out.println("Enter the User Name");
		userName = read.nextLine();
		System.out.println("User Name =  " + userName);
	}
}
