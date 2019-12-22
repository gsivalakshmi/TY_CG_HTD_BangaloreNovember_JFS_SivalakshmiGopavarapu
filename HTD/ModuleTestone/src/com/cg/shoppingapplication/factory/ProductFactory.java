package com.cg.shoppingapplication.factory;


import com.cg.shoppingapplication.dao.ProductDao;
import com.cg.shoppingapplication.dao.ProductDaoImpl;
import com.cg.shoppingapplication.services.ProductServices;
import com.cg.shoppingapplication.services.ProductServicesImpl;

public class ProductFactory {
private ProductFactory() {
		
	}
	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao= new ProductDaoImpl();
		return dao;
	}
	
	public static ProductServices instanceOfProductServices() {
		ProductServices services=new ProductServicesImpl();
		return services;
	}
}

