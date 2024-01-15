package com.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class TractorDriver {
	@Autowired
	Vehicle v;
	
	public void m1() {
		v.start();
	}
	
	public void m2()
	{
		v.start();
		System.out.println("HII");
	}
	public void driving()
	{
		v.start();
		System.out.println("driver is here");
	}
		
	
	
	}


