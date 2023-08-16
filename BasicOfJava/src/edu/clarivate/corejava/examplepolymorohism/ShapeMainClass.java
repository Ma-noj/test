package edu.clarivate.corejava.examplepolymorohism;

public class ShapeMainClass {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setLength(10);
		rectangle.getArea();

		Square square = new Square();
		square.setLenght(5);
		square.getArea();
	}

}
