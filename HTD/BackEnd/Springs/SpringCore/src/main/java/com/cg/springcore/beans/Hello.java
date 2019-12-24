package com.cg.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {//implements InitializingBean, DisposableBean {
	public  Hello() {
		System.out.println("object created....");
	}
	public Hello(String msg, int count) {
		super();
		this.msg = msg;
		this.count = count;
	}

	private String msg;
	private int count;
	@PostConstruct
	public void init() {
		System.out.println("init method....");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method......");
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	//	@Override
	//	public void afterPropertiesSet() throws Exception {
	//		// TODO Auto-generated method stub
	//		System.out.println("After properties.....");
	//	}



}
