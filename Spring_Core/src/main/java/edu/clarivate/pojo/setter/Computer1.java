package edu.clarivate.pojo.setter;

public class Computer1 {
	Usb usb;

	public void setUsb(Usb usb) {
		this.usb = usb;
	}
	
	public void use() {
		System.out.println(" I'm using Computer to ");
		usb.connect();
	}

}