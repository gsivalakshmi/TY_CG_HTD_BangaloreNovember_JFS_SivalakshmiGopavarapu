package com.tyss.threads.creatingthread;

public class TestD {
public static void main(String[] args) {
	System.out.println("main starts...");
	IRCTC i1=new IRCTC();
	User2 u=new User2(i1);
	u.start();
	User2 u1=new User2(i1);
	u1.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	i1.leaveMe();
	System.out.println("main ends.......");
}
}
