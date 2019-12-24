package com.cg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.beans.Animal;
import com.cg.springcore.beans.Hello;
import com.cg.springcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml") ;
		Hello hello=context.getBean(Hello.class);
		
		Hello hello2=context.getBean(Hello.class);
		
		System.out.println("**************************************");
		System.out.println(hello==hello2);
		System.out.println("*****************");
		System.out.println("**********************");
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println("*****************");
		hello.setCount(Integer.parseInt("100"));
		System.out.println(hello.getMsg());
		System.out.println(hello.getCount());
		
		System.out.println("**********************");
		Animal animal=context.getBean(Animal.class);
		animal.makeSound();
		
		System.out.println("******************");
		Pet p=context.getBean(Pet.class);
		System.out.println(p.getName());
		p.getAnimal().makeSound();
	}
}
