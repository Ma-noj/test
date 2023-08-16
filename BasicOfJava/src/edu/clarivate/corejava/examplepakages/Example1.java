package edu.clarivate.corejava.examplepakages;

public class Example1 {
	private int num1 = 10;
	int num2 = 20;
	protected int num3 = 30;
	public int num4 = 40;

	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.num3);
		System.out.println(obj.num4);
	}
}
