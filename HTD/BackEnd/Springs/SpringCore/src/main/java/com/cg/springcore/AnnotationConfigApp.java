package com.cg.springcore;

import java.text.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.springcore.beans.Animal;
import com.cg.springcore.beans.Book;
import com.cg.springcore.beans.Hello;
import com.cg.springcore.beans.Pet;
import com.cg.springcore.config.BeansConfig;

public class AnnotationConfigApp {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);
	Hello hello1=context.getBean(Hello.class);
	System.out.println(hello1.getCount());
	System.out.println(hello1.getMsg());
	
	System.out.println("******************");
	Hello hello2=context.getBean(Hello.class);
	
	System.out.println(hello1);
	System.out.println(hello2);
	System.out.println(hello1==hello2);
	
	System.out.println("***************************");
	
	Animal animal=context.getBean(Animal.class);
	animal.makeSound();
	
	System.out.println("****************");
	Pet p=context.getBean(Pet.class);
	System.out.println(p.getName());
	p.getAnimal().makeSound();
	
	System.out.println("*******************");
	Book b=context.getBean(Book.class);
	System.out.println(b.getName());
	System.out.println(b.getAuthor().getName());
	
	
	
}
}
