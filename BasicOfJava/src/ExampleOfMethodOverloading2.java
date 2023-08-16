
public class ExampleOfMethodOverloading2 {

	// name
	// email
	// phone
	// password
	public static void main(String[] args) {
		findUser("Ram");
		findUser(9873625353l);
	}

	public static void findUser(String userName) {
		// find user based on the name
		System.out.println("find user based on the name" + userName);
	}

	public static void findUser(long phoneNumber) {
		// find user based on the phoneNumber
		System.out.println("find user based on the phoneNumber" + phoneNumber);
	}

	public static void findUser(String userEmail, String password) {
		// find user based on the email and password
		System.out.println("find user based on the email and password");
	}

	public static void findUser(long phoneNumber, String password) {
		// find user based on the phoneNumber password
		System.out.println("find user based on the phoneNumber password");
	}

}
