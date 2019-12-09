package com.tyss.typeCasting.Pack1;

public class Primitive {
    //implicit casting
	byte b=4;
	
	short s=b;
	
	int i=b;
	
	long l=b;
	
	float f=b;
	
	double d=b;
	void values() {
		System.out.println("byte value is:"+ b);
		System.out.println("short value is:"+ s);
		System.out.println("int value is:"+ i);
		System.out.println("float value is:"+ f);
		System.out.println("long value is:"+ l);
		System.out.println("double value is:"+ d);
	}
	//explicit casting
	
	double pi=3.142;
	
	int i1=(int)pi;
	
     byte b1=(byte)pi;
	
	short s1=(short)pi;
	
	long l1= (long)pi;
	
	float f1=(float)pi;
	
	double d1=(double)pi;
	void details() {
		System.out.println("byte value is:"+ b1);
		System.out.println("short value is:"+ s1);
		System.out.println("int value is:"+ i1);
		System.out.println("float value is:"+ f1);
		System.out.println("long value is:"+ l1);
		System.out.println("double value is:"+ d1);
	}
	
	
}
