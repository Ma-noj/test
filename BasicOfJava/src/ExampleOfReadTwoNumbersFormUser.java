import java.util.Scanner;//Step1

public class ExampleOfReadTwoNumbersFormUser {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);// Step2
		System.out.println("Enter User Name  = ");
		String userName = read.nextLine();// Step3

		System.out.println("User Name  =  " + userName);
	}

}
