package com.tyss.threads.creatingthread;

public class TestB {
public static void main(String[] args) {
	System.out.println("main starts....");
	Thread2 t1=new Thread2();
	
	Thread t=new Thread(t1);
	t.start();
	System.out.println("main ends......");
}
}
