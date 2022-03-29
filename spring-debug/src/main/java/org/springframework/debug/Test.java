package org.springframework.debug;

import org.springframework.debug.supplier.User;

/**
 *<P>@author: 陈杰
 *<P>描述:测试类
 *<P>2021/12/1 0001 17:54
 *
 */
public class Test {

	public static void main(String[] args) {

		MyClassPathXMLApplicationContext ac = new MyClassPathXMLApplicationContext("applicationContext.xml");

		MyFactoryBean bean1 = (MyFactoryBean) ac.getBean( "&myFactoryBean");
        System.out.println(bean1);
        User bean = (User) ac.getBean("myFactoryBean");
        System.out.println(bean.getUsername());
//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
//        Person person = ac.getBean("person", Person.class);
//        ac.close();postProcessBeanFactory
//        Person person2 = ac.getBean("person", Person.class);
//		MyClassPathXMLApplicationContext ac = new MyClassPathXMLApplicationContext("selfEditor.xml");
//		Customer bean = ac.getBean(Customer.class);
//		System.out.println(bean);
	}
}

