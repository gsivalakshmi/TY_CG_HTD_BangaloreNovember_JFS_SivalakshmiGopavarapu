package com.caps.phonesimulatorapplicationdevelopment.bean;

import java.util.Scanner;

import com.caps.phonesimulatorapplicationdevelopment.dao.ContactDao;
import com.caps.phonesimulatorapplicationdevelopment.manager.ContactManager;

public class ContactMain {
	public static void main(String[] args) {
	ContactBean bean=new ContactBean();
	ContactDao dao=ContactManager.getContactDao();
	Scanner sc=new Scanner(System.in);
	char ch='y';
	while(ch=='y'||ch=='y') {
		System.out.println("............Phone Simulation Application......");
	System.out.println("Press 1 to show all contacts");
	System.out.println("Press 2 to search contacts");
	System.out.println("Press 3 to operate on contacts");
	System.out.println("press 4 go back to home...");
	int choice=sc.nextInt();
	switch (choice){
	case 1:
		System.out.println("Enter contact to operate");
		System.out.println("Enter Username...");
		String uname=sc.next();
		System.out.println("Enter contact number...");
		int cnumber=sc.nextInt();
		System.out.println("Enter groupname...");
		String gname=sc.next();
		ContactBean bean1=new ContactBean();
		bean1.setName(gname);
		bean1.setNumber(cnumber);
		bean1.setGrop(gname);
		boolean check=dao.addContact(bean1);
		if(check) {
			System.out.println("contact details added to the list");
		}
		else
		{
			System.out.println("contactno is repeated");
		}
		
		System.out.println("do u want to countinue(y/n) ");
		ch=sc.next().charAt(0);
		break;
	case 2:
		System.out.println("Enter contactame to search");
		int contactname1=sc.nextInt();
		if(bean!=null)
		{
		ContactBean bean2=dao.getContact(contactname1);
		//System.out.println(bean2.getName());
		System.out.println(bean2.getNumber());
		System.out.println(bean2.getGrop());
		}
		else {
			System.out.println("contact details not found....!!!");
		}

		System.out.println("do u want to countinue(y/n)");
		ch=sc.next().charAt(0);

		break;
	case 3:
		System.out.println(dao.getAllContacts());
		System.out.println("do u want to countinue(y/n) ");
		ch=sc.next().charAt(0);
		break;
	case 4:
		
		System.out.println("do u want to countinue(y/n) ");
		ch=sc.next().charAt(0);
		default:
			break;
	}
	}
}
}
		
			
