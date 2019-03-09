package com.junyu.action;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.junyu.enity.Person;
import com.junyu.service.PersonService;

@Controller
public class PersonAction {
	
	@Autowired
	PersonService personService;
	
	@Test
	public void testPerson(){
		ApplicationContext application = new ClassPathXmlApplicationContext("application-context.xml");
		PersonAction personAction = (PersonAction) application.getBean("personAction");
		Person person = personAction.personService.queryPersonById(3);
//		Person person = new Person();
//		person.setName("name2");
//		person.setAddress("address2");
//		person.setAge(11);
//		person.setBirthday("20190102");
//		personAction.personService.insertPerson(person);
		System.out.println(person);
	}

}
