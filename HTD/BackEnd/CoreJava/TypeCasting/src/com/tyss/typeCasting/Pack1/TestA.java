package com.tyss.typeCasting.Pack1;

public class TestA {
public static void main(String[] args) {
	Animal a1=new Animal();
	a1.eat();
	
	Animal a2=new HemaDog();
	a2.eat();
	
	HemaDog hd=(HemaDog) a2;
	hd.eat();
	hd.walk();
	
	Animal a3=new ShivaLion();
	ShivaLion sl=(ShivaLion) a3;
	sl.eat();
	sl.run();
}
}
