package com.cg.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.cg.springcore.beans.Author;
import com.cg.springcore.beans.Book;
import com.cg.springcore.beans.Cat;
import com.cg.springcore.beans.Dog;
import com.cg.springcore.beans.Hello;
import com.cg.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean("hellooooo")
	@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMsg("love u pappaaa.....");
		hello.setCount(100);
		return hello;
	}
	@Bean(name= "dog")
	public Dog getDog() {
		return new Dog();
	}
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	@Bean("pet")
	public Pet getPet() {
		Pet p=new Pet();
		p.setName("dragii");
		//p.setAnimal(getDog());
		return p;
	}
	@Bean("book")
	public Book getBook() {
		Book b=new Book();
		b.setName("Springs");
		b.setAuthor(getAuthor());
		return b;
	}
	@Bean("author")
	public Author getAuthor() {
		return new Author();
	}
}
