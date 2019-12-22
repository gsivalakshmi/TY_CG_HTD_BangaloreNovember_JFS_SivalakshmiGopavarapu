package com.cg.shoppingapplication.services;

import java.util.List;

import com.cg.shoppingapplication.bean.ProductBean;

public interface ProductServices {
	public ProductBean SearchProduct(String productname);
	List<ProductBean> getAllProducts();
}
