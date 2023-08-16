package edu.clarivate.pojo;

import org.springframework.stereotype.Component;

@Component(value = "user1")
public class UserInfo {

	public void display() {
		System.out.println("Hi");
	}

}
