package edu.clarivate.pojo.setter;

public class Computer {
	public int id;
	String name;
	protected String processor;
	private int ram;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void display() {
		System.out.println("Computer Id = " + id);
		System.out.println("Computer Name = " + name);
		System.out.println("Computer Processor = " + processor);
		System.out.println("Computer Ram = " + ram+" GB");
	}

}
