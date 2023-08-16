package edu.clarivate.corejava.examplepolymorohism;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void getArea() {
		int area = length * width;
		System.out.println("Area of a Rectangle = " + area);
	}

}
