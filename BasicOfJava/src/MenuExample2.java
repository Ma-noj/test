
public class MenuExample2 {
	public static void main(String[] args) {
		System.out.println("Select the Your Choice: ");
		System.out.println("1.Idily");
		System.out.println("2.Dosa");
		System.out.println("3.Puri");
		System.out.println("4.Rice Bath");

		int choice = 4;

		switch (choice) {
		case 1:
			System.out.println("Total Cost = 20");
			break;
		case 2:
			System.out.println("Total Cost = 40");
			break;
		case 3:
			System.out.println("Total Cost = 50");
			break;
		case 4:
			System.out.println("Total Cost = 45");
			break;

		default:System.out.println("Select A Valied Choice!!");
			break;
		}
	}
}
