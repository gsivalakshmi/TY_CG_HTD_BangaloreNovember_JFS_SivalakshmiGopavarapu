package com.cg.shoppingapplication.dao;



import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.shoppingapplication.bean.ProductBean;

public class ProductDaoImpl implements ProductDao{
	FileReader reader=null;
	Properties prop=null;
	private List<ProductBean> bean;
	ProductBean bean1 = new ProductBean();

	@Override
	public ProductBean SearchProduct(String productname) {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection con= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));){
			while(rs.next()) {
				bean1.setProdid(rs.getInt(1));
				bean1.setPname(rs.getString(2));
				bean1.setColor(rs.getString(3));
				bean1.setPcost(rs.getDouble(4));
				bean1.setPdesc(rs.getString(5));
				bean1.setNoofproducts(rs.getInt(6));
				list.add(bean1);
			}
				return bean1;
		
			
		}catch (Exception e) {
		}// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<ProductBean> getAllProducts() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection con= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),
				prop.getProperty("dbPassword"));
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));){
			while(rs.next()) {
				ProductBean bean1 = new ProductBean();
				bean1.setProdid(rs.getInt(1));
				bean1.setPname(rs.getString(2));
				bean1.setColor(rs.getString(3));
				bean1.setPcost(rs.getDouble(4));
				bean1.setPdesc(rs.getString(5));
				bean1.setNoofproducts(rs.getInt(6));
				list.add(bean1);
				return list;
			}
	}catch (Exception e) {
		e.printStackTrace();
	}

return null;
	
}
}



