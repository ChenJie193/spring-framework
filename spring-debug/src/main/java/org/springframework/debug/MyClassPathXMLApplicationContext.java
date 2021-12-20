package org.springframework.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXMLApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXMLApplicationContext(String... configLocations){
		super(configLocations);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertySource");
		getEnvironment().setRequiredProperties("username");
	}
}
