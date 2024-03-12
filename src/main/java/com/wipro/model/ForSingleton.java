package com.wipro.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ForSingleton {
	
	
	private String name;

	public ForSingleton() {

		System.out.println("Singleton");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
