package com.Google.GDrive;
import com.Yahoo.Ymail.Ymail;
public class GDrive extends Ymail{
	
	@Override
	public void Store_photos() 
	{
			System.out.println("photos are stored in google drive");
			
		
	}

	public static void main(String[] args) {
		GDrive gd=new GDrive();
		gd.Store_photos();
	}
}
