package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wipro.model.ForPrototype;
import com.wipro.model.ForSingleton;

@SpringBootApplication
public class SpringBootScopesApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootScopesApplication.class, args);
		

		
		ForSingleton single1 = context.getBean(ForSingleton.class);
		ForSingleton single2 = context.getBean(ForSingleton.class);
		ForSingleton single3 = context.getBean(ForSingleton.class);

		ForPrototype prototype1 = context.getBean(ForPrototype.class);
		ForPrototype prototype2 = context.getBean(ForPrototype.class);
		ForPrototype prototype3 = context.getBean(ForPrototype.class);
		System.out.println();
		System.out.println("Singleton Reference");
		
		System.out.println(single1.hashCode());
		System.out.println(single2.hashCode());
		System.out.println(single3.hashCode());
		System.out.println();
		
		
		System.out.println("Prototype Reference");
		System.out.println(prototype1.hashCode());
		System.out.println(prototype2.hashCode());
		System.out.println(prototype3.hashCode());

		System.out.println();
		
		if (single1.equals(single2)) {
			System.out.println("They singleton beans are same ");
		}
		
		
		System.out.println();
		
		if (prototype1.equals(prototype3)) {
			System.out.println("the  prototype beans are same");
		} else {
			System.out.println("the prototype beans are not same");
		}
		
		System.out.println();
		
		single1.setName("Niko");
		
		System.out.println(single2.getName());
		
		System.out.println();
		
		
		
		prototype1.setName("Name For Prototype");
		
		System.out.println(prototype2.getName());

	}

}
