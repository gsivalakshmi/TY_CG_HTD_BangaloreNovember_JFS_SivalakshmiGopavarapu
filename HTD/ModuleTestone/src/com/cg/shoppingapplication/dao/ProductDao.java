package com.cg.shoppingapplication.dao;

import java.util.List;

import com.cg.shoppingapplication.bean.ProductBean;

public interface ProductDao {
	public ProductBean SearchProduct(String productname);
	List<ProductBean> getAllProducts();
}
