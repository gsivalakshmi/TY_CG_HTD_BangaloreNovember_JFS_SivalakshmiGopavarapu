package com.tyss.threads.creatingthread;

public class User2 extends Thread {
IRCTC i1;

public User2(IRCTC i1) {
	super();
	this.i1 = i1;
}

public void run() {
i1.confirmTicket();
}
}
