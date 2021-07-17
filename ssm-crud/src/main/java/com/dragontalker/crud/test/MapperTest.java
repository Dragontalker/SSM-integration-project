package com.dragontalker.crud.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

	/**
	 * Test DepartmentMapper
	 */
	@Test
	public void testCRUD() {
		
		// 1. Create Spring IOC container
		ApplicationContext ioc = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Get bean from container
	}
}
