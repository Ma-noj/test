package edu.clarivate.pojo.constructor;

public class Computer {
	Usb usb;

	public Computer(Usb usb) {
		super();
		this.usb = usb;
	}

	public void use() {
		System.out.println(" I'm using Computer constructor to  ");
		usb.connect();
	}
}
