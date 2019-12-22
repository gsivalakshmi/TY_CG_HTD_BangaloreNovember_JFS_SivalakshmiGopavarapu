package com.cg.shoppingapplication.admin;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("Shopping Application");
			System.out.println("press 1 to show all items...");
			System.out.println("press 2 to search an item??");
			System.out.println("press 3 to exit");
			int options=sc.nextInt();
			switch (options) {
			case 1:
				ProductMain p =new ProductMain();
				p.product();
				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);
				break;
			case 2:
				ProductMain p1=new ProductMain();
				p1.search();
				p1.details();
				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);
				break;
			case 3:
				System.exit(options);

			default:
				break;
			}
		}
	}
}


