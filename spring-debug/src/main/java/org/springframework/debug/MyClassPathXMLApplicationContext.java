package org.springframework.debug;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
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

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {

		/**
		 *<P>@author: 陈杰
		 *<P>描述:设置属性值
		 * @see org.springframework.context.support.AbstractRefreshableApplicationContext#customizeBeanFactory(org.springframework.beans.factory.support.DefaultListableBeanFactory)
		 *
		 */
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
