package com.tyss.access.pack2;

import com.tyss.access.pack1.Student;

public class TestStu extends Student {
	protected TestStu(String name) {
		super(name);
	}
	void studDetails() {
		System.out.println("nam is"+name);
	}
	public static void main(String[] args) {
		
	
	TestStu ts=new TestStu("john");
	ts.stuDetails();
	}

}
