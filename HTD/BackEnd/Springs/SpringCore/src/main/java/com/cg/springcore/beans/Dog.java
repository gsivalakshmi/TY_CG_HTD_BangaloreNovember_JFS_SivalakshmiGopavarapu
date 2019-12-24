package com.cg.springcore.beans;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("BaoooBaooo");
	}

}
