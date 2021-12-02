package org.springframework.debug;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *<P>@author: 陈杰
 *<P>描述:测试类
 *<P>2021/12/1 0001 17:54
 *
 */
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        Person person = ac.getBean("person", Person.class);
        ac.close();
        Person person2 = ac.getBean("person", Person.class);
	}
}

