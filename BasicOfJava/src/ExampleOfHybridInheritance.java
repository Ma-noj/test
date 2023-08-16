
public class ExampleOfHybridInheritance {
	public static void main(String[] args) {
		C objC = new C();
		System.out.println("From C Class Object Salary = " + objC.salary);
		System.out.println("From C Class Object Bounucy = " + objC.bounus);
		System.out.println("From C Class Object Str = " + objC.str);

		D objD = new D();
		System.out.println("From D Class Object Salary = " + objD.salary);
		System.out.println("From D Class Object Bounucy = " + objD.bounus);
	}
}
