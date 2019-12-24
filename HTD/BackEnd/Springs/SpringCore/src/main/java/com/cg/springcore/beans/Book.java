package com.cg.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
public String name;
@Autowired
public Author author;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}


}
