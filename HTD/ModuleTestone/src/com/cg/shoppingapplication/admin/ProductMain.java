package com.cg.shoppingapplication.admin;

import java.util.List;
import java.util.Scanner;

import com.cg.shoppingapplication.bean.ProductBean;
import com.cg.shoppingapplication.bean.ProductMngr;
import com.cg.shoppingapplication.dao.ProductDao;
import com.cg.shoppingapplication.factory.ProductFactory;
import com.cg.shoppingapplication.services.ProductServices;

public class ProductMain {
	ProductBean bean=new ProductBean();
	ProductServices services=ProductFactory.instanceOfProductServices();
	List<ProductBean> bean1=services.getAllProducts();

	public void product() {
		if(bean1!=null) {
			for(ProductBean user:bean1) {
				System.out.println(user);
			}
		}else {
			System.out.println("details not found....");
		}

	}
	public void search() {
		ProductBean bean2=services.SearchProduct(bean.getPname());
		if(bean!=null) {
			System.out.println(bean2.getProdid());
			System.out.println(bean2.getPname());
			System.out.println(bean2.getPcost());
			System.out.println(bean2.getColor());
			System.out.println(bean2.getPdesc());
			System.out.println(bean2.getNoofproducts());

		}else {
			System.out.println("sorry!!product is not available");
		}
	}
	public void details() {
		Scanner sc=new Scanner(System.in);
		char ch='y';
		while(ch=='y'||ch=='y') {
			System.out.println("press 1 to buy...");
			System.out.println("press 2 to search again");
			System.out.println("press 3 to go back..");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Added into cart...and enter your cardno,cvv details");
			String s=sc.next();
			System.out.println("Enter cardno..");
			long l=sc.nextLong();
			System.out.println("Enter cvv");
			int i=sc.nextInt();
			System.out.println("Thank you...!!");
			System.out.println("do u want to countinue(y/n)");
			ch=sc.next().charAt(0);
			break;
			case 2:
				ProductMain pm=new ProductMain();
				pm.search();
				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);
				break;
			case 3:
				Home.main(null);
				System.out.println("do u want to countinue(y/n)");
				ch=sc.next().charAt(0);
				break;
			}
		}

	}
}