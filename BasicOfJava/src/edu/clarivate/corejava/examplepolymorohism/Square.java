package edu.clarivate.corejava.examplepolymorohism;

public class Square extends Shape {
	private int lenght;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public void getArea() {
		int area = lenght * lenght;
		System.out.println("Area of a Square =  " + area);
	}
}
