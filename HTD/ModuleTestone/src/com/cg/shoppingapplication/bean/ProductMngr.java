package com.cg.shoppingapplication.bean;

import com.cg.shoppingapplication.dao.ProductDao;
import com.cg.shoppingapplication.dao.ProductDaoImpl;

public class ProductMngr {
	public static ProductDao getProductDao() {
		return new ProductDaoImpl(); 	
	}
}
