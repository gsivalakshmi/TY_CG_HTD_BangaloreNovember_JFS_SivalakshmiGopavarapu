package com.cg.shoppingapplication.services;

import java.util.List;

import com.cg.shoppingapplication.bean.ProductBean;
import com.cg.shoppingapplication.dao.ProductDao;
import com.cg.shoppingapplication.dao.ProductDaoImpl;
import com.cg.shoppingapplication.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices{
	ProductDao dao=ProductFactory.instanceOfProductDaoImpl();

	@Override
	public ProductBean SearchProduct(String productname) {
		// TODO Auto-generated method stub
		return dao.SearchProduct(productname);
	}

	@Override
	public List<ProductBean> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

	
}
