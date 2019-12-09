package com.Yahoo.Ymail;
import com.Google.Gmail.Gmail;
public class Ymail extends Gmail {
	@Override
	public void send_email()
	{
		System.out.println("yahoo is sending emails");
	}
	public void Store_photos()
	{
		System.out.println("photos are stored in google drive");
	}
public static void main(String[] args) {
	Ymail y=new Ymail();
	y.send_email();
}
}
